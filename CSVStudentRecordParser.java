import java.util.Scanner;

public class CSVStudentRecordParser {

    public static void parseStudentRecord(String line) {
        String[] fields = line.split(",", -1);

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + fields[0].trim()
                + " | Roll No: " + fields[1].trim()
                + " | Dept: " + fields[2].trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record (Name,RollNumber,Department): ");
        String line = sc.nextLine();

        parseStudentRecord(line);
        sc.close();
    }
}
