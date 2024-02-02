
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

    public class TDFFileReader {
        public List<Rider> readRidersFromFile(String fileName) {
            List<Rider> riders = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    riders.add(new Rider(values[0], values[1]));
                }
            } catch (Exception e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
            return riders;
        }
    }


