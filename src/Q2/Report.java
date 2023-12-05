package Q2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    public static void printToConsole(Reportable reportable) {
        String report = reportable.generateReport();
        System.out.println(report);
    }

    public static void persistToCSV(Reportable reportable, String fileName) throws IOException {
        String report = reportable.generateReport();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(report);
        }
    }
}
