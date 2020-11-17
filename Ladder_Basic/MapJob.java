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

    protected void map(LongWritable key, Text value ,Context context)
            throws IOException, InterruptedException
    {
        Configuration conf = context.getConfiguration();
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

    protected void cleanup(Context context)
            throws IOException, InterruptedException
    {
        for(Double i: tree.values())
        {
            context.write(new DoubleWritable(i), new DoubleWritable(i));
        }
    }
}