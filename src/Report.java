
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 06/05/2022
 */

import java.util.ArrayList;
import java.util.Scanner;

/* declare class report */
public class Report {

    /* method to create a report according the option selected from the menu */
    public static String getReport(ArrayList<Student> students, int choice) {

        for (Student Student: students) {

            /* Report of all students with grades for all modules */
            if (choice == 1) {
                System.out.println("\n" + Student);

            /* check students had a failed module */
            } else if (choice == 2) {

                if (Student.grades.get(0).getProgGrade().equals("F")) {
                    System.out.println(" * " + Student.getName() + " " +Student.getProgramming() + "%"
                            + " = failed the Programming module");
                    Student.setFailedModule(true);
                }
                if (Student.grades.get(0).getWebGrade().equals("F")) {
                    System.out.println(" * " + Student.getName() + " " + Student.getWebDev() + "%"
                            + " = failed the Web Dev module");
                    Student.setFailedModule(true);
                }
                if (Student.grades.get(0).getMathGrade().equals("F")) {
                    System.out.println(" * " + Student.getName() + " " + Student.getMaths() + "%"
                            + " = failed the Math module");
                    Student.setFailedModule(true);
                }
                if (Student.grades.get(0).getAlgGrade().equals("F")) {
                    System.out.println(" * " + Student.getName() + " " + Student.getAlgorithms() + "%"
                            + " = failed the Algorithm module");
                    Student.setFailedModule(true);
                }

            /* calculates average grade for each students */
            } else if (choice == 3) {
                System.out.println(" * " + Student.getName() + " = "+ Student.getAverage() + "%");

            /* get data from user to add a new student */
            } else if (choice == 4) {
                Scanner in = new Scanner(System.in);
                System.out.println("Please enter your name (first and surname only):");
                String name = in.next() + " " + in.next();
                System.out.println("Please enter name of the department:");
                String department = in.next();
                System.out.println("Please enter your age:");
                int age = in.nextInt();
                System.out.println("Please enter your student number:");
                int studentNum = in.nextInt();
                System.out.println("Full time student? (true/false only)");
                boolean fullTime = in.nextBoolean();
                System.out.println("Please enter programming grade");
                int proGrade = in.nextInt();
                System.out.println("Please enter web dev grade");
                int webGrade = in.nextInt();
                System.out.println("Please enter maths grade");
                int mathGrade = in.nextInt();
                System.out.println("Please enter algorithm grade");
                int algGrade = in.nextInt();
                /* add a new student to array students */
                students.add(new Student(name, department, age, studentNum, fullTime,
                        proGrade, webGrade, mathGrade, algGrade));
                /* exit the for loop */
                break;
            }
        }
        return "";
    }
}
