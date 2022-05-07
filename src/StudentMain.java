
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

import java.util.ArrayList;
import java.util.Scanner;

/* declare class main app student */
public class StudentMain {

    /* main method of the application */
    public static void main(String[] args) {

        /* create array list to store students data */
        ArrayList<Student> students = new ArrayList<>();

        /* add students data */
        students.add(new Student("Bert Smith", "Computing", 21,
                12345, true, 52, 63, 76, 68));

        students.add(new Student("Olivia Green", "Computing", 19,
                23464, true, 73, 82, 72, 66));

        students.add(new Student("Eloise Jones",  "Computing", 18,
                34744, true, 65, 63, 37, 40));

        students.add(new Student("Ben Bird",  "Computing", 42,
                34834, false, 55, 29, 56, 38));

        students.add(new Student("Karen Brown",  "Computing", 45,
                45632, false, 62, 51, 43, 43));

        /* declare variable to be used with the menu */
        String choice;

        do {
            // display menu with options to be selected by the user
            System.out.println("\n" +
                    "** Enter any number followed by enter, press h to quit:\n" +
                    " 1. Report of all students with grades for all modules\n" +
                    " 2. Report of all students with failed module\n" +
                    " 3. Report average grade for each student\n" +
                    " 4. Add a new student");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    System.out.println(">> Report of all students with grades for all modules:");
                    /* print out the results */
                    System.out.println(Report.getReport(students, Integer.parseInt(choice)));
                    break;
                case "2":
                    System.out.println(">> Report of all students with failed module:");
                    /* print out the results */
                    System.out.println(Report.getReport(students, Integer.parseInt(choice)));
                    /* in case we don't have a students to print out user receives a message */
                    //if (!Student.isFailedModule()) {
                        System.out.println("** Students not found");
                    //}
                    break;
                case "3":
                    System.out.println(">> Report average grade for each student:");
                    /* print out the results */
                    System.out.println(Report.getReport(students, Integer.parseInt(choice)));
                    break;
                case "4":
                    System.out.println(">> Add a new students: ");
                    /* get input from the user to add a new student */
                    System.out.println(Report.getReport(students, Integer.parseInt(choice)));
                    /* inform user the student was added to the list of students */
                    System.out.println("** New student added successfully **");
                    break;
                case "h":
                    System.out.println("Exiting menu goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println(".. Invalid selection");
                    break;
            }
        }while (true);
    }
}