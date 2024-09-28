import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatasetLoader {

    public static List<CSVRecord> loadDataset(String filePath) {
        List<CSVRecord> records = new ArrayList<>();
        try {
            CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new FileReader(filePath));
            records = csvParser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
