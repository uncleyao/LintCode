ackage com.topn;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.TreeMap;

public class reduceJob extends Reducer<DoubleWritable, DoubleWritable, DoubleWritable, DoubleWritable>
{
    private TreeMap<Double, Double> tree = new TreeMap<>();
    @Override
    protected void reduce(DoubleWritable key,
                          java.lang.Iterable<DoubleWritable> values,
                          Context context)
            throws IOException, InterruptedException {

        Configuration conf = context.getConfiguration();
        String KValue = conf.get("k");
        int k = Integer.valueOf(KValue);

        for(DoubleWritable i : values)
        {
            tree.put(new Double(i.get()), new Double(i.get()));
            if (tree.size() > k) {
                tree.remove(tree.firstKey());
            }
        }
    }


    @Override
    protected void cleanup(Context context)
            throws IOException, InterruptedException {
        for(Double i : tree.values())
        {
            context.write(new DoubleWritable(i), new DoubleWritable(i));
        }
    }


}