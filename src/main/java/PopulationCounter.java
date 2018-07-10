import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import static org.apache.spark.sql.functions.countDistinct;


public class PopulationCounter {

    public Dataset<Row> count(final Dataset ds) {
        final Dataset<Row> aggregatedPeopleDs =
                ds.groupBy(ds.col("country"), ds.col("ip_address")).agg(countDistinct("ip_address").as("counted"));

        final Dataset<Row> countedDs = aggregatedPeopleDs.groupBy(aggregatedPeopleDs.col("country")).sum();
        final Dataset<Row> result = countedDs.withColumnRenamed("sum(counted)", "population");
        return result;
    }
}
