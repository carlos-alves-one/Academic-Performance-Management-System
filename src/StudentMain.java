
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

import java.util.ArrayList;

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
    }

    /* declare variable to be used with the menu */
    String choice;

    
}