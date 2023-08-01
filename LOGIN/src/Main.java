// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;

class AttendanceApp {
    private ArrayList<String> attendedStudents;

    public AttendanceApp() {
        attendedStudents = new ArrayList<>();
    }

    public void markAttendance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of students attending today (separate with spaces):");
        String input = scanner.nextLine();
        String[] names = input.split(" ");

        for (String name : names) {
            attendedStudents.add(name);
        }

        scanner.close();
    }

    public void displayAttendance() {
        System.out.println("you are attend :");
        for (String name : attendedStudents) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        AttendanceApp app = new AttendanceApp();

        app.markAttendance();
        app.displayAttendance();
    }
}