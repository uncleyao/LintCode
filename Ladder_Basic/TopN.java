ackage com.topn;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;


public class TopN {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException{
        Configuration conf = new Configuration(true);
        conf.set("k", "1000");


        Job job = new Job(conf);
        job.setJobName("top K");
        job.setJarByClass(TopN.class);

        job.setMapperClass(mapJob.class);
        job.setReducerClass(reduceJob.class);

        job.setMapOutputKeyClass(IntWritable.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setNumReduceTasks(100);

        FileInputFormat.addInputPath(job, new Path(".../input/topk/"));
        FileOutputFormat.setOutputPath(job, new Path(".../output/topk/"));

        System.exit(job.waitForCompletion(true)? 0 : 1);
    }
}