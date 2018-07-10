import bean.User;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

import org.apache.spark.sql.SparkSession;


public class AppStarter {

    public static void main(String[] args) {

        //        SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("CountingSheep");
        //        SparkContext sc = new SparkContext(conf);

        SparkSession sparkSession = SparkSession.builder().master("local[*]").appName("CountriesPopulation")
                .config("spark.sql.parquet.binaryAsString", "true").getOrCreate();


        Dataset<User> sampleDs = sparkSession.read().parquet("/Users/nicoletav/Downloads/userdata1.parquet")
                .as(Encoders.bean(User.class));
        sampleDs.show(3, true);

        PopulationCounter p = new PopulationCounter();

        WriteToParquet w = new WriteToParquet();
        w.writeParquet("peopleInCountries.parquet", p.count(sampleDs));
    }
}
