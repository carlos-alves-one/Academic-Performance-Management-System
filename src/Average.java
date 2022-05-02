
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

/* declare class average */
public class Average {

    public static double calcAverage(double programming, double webdev,
                                     double maths, double algorithms) {

        /* declare variable to store the total of all modules to calculate average */
        double total = programming + webdev + maths + algorithms;

        /* return average for each student */
        return total / 4;
    }
}
