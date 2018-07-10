import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;


public class WriteToParquet {

    public void writeParquet(final String fileName, final Dataset<Row> ds) {
        ds.coalesce(1).write().parquet("/Users/nicoletav/" + fileName);
    }
}

