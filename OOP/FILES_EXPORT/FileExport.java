package OOP.FILES_EXPORT;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExport {

    // Exports details as a formatted ASCII tabular text file (.txt)
    public static void exportToTextFile(Students[] students, String filename) {
        File file = new File(filename);
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            String border = "+-----------------+----------------------+---------------------------+-------+-------+";
            String header = String.format("| %-15s | %-20s | %-25s | %-5s | %-5s |",
                    "REG NO", "NAME", "STUDENT COURSE", "MARKS", "GRADE");

            writer.println(border);
            writer.println(header);
            writer.println(border);

            for (Students s : students) {
                if (s != null) {
                    writer.println(String.format("| %-15s | %-20s | %-25s | %-5d | %-5c |",
                            s.regNO, s.name, s.course, s.marks, s.grade));
                }
            }
            writer.println(border);

            System.out.println("\n[SUCCESS] Text file exported successfully!");
            System.out.println("Full Path: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Exports details in CSV tabular format (.csv)
    public static void exportToCSV(Students[] students, String filename) {
        File file = new File(filename);
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Reg No,Name,Student Course,Marks,Grade");
            for (Students s : students) {
                if (s != null) {
                    writer.println(s.regNO + "," + s.name + "," + s.course + "," + s.marks + "," + s.grade);
                }
            }
            System.out.println("[SUCCESS] CSV file exported successfully!");
            System.out.println("Full Path: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}