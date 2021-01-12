from pyspark.sql import SparkSession
from pyspark.sql.types import DoubleType
from pyspark.sql import functions as f


class ChargePointsETLJob:
    input_path = 'data/input/electric-chargepoints-2017.csv'
    output_path = 'data/output/chargepoints-2017-analysis'
    

    def __init__(self):
        self.spark_session = (SparkSession.builder
                                          .master("local[*]")
                                          .appName("ElectricChargePointsETLJob")
                                          .getOrCreate())

    def extract(self):
        return self.spark_session.read.csv(self.input_path,header=True)


    def transform(self, df):
        df.filter(df.CPID=='AN03155').show()
        return df.withColumn('PluginDuration',f.col('PluginDuration').cast(DoubleType())).groupBy('CPID').agg(f.max('PluginDuration').alias('max_duration'),f.mean('PluginDuration').alias('avg_duration')).withColumnRenamed('CPID','chargepoint_id').withColumn("max_duration",f.round(f.col("max_duration"),2)).withColumn("avg_duration",f.round(f.col("avg_duration"),2))
    
    def load(self, df):
        pass

    def run(self):
        self.load(self.transform(self.extract()))
