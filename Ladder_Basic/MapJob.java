package com.topn;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.TreeMap;

public class mapJob extends Mapper<LongWritable, Text, DoubleWritable,DoubleWritable>
{
    private TreeMap<Double, Double> tree = new TreeMap<>();
    // 内部对key排序

    protected void map(LongWritable key, Text value ,Context context)
            throws IOException, InterruptedException
    {
        Configuration conf = context.getConfiguration();
        // 传入top k，也就是1000
        String ktext = conf.get("k");
        int k = Integer.valueOf(ktext);

        String line = value.toString();
        if(line.length() > 0)
        {
            String[] tokens = value.toString().split(",");

            Double i = Double.parseDouble(tokens[1]);
            tree.put(i, i);

            if (tree.size() > k) {
                tree.remove(tree.firstKey());
            }
        }
    }
    // MR有局限性 map()只能处理一行，reduce()只能处理一组，但如果想只输出一部分结果就用cleanup

    protected void cleanup(Context context)
            throws IOException, InterruptedException
    {
        for(Double i: tree.values())
        {
            context.write(new DoubleWritable(i), new DoubleWritable(i));
        }
    }
}