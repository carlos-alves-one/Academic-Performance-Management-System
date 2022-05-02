
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

/* declare class toy */
public class StudentMain {

    /* declare instances variables */
    private final Object average;
    private final double programming;
    private final double webDev;
    private final double maths;
    private final double algorithms;
    private static boolean failedModule;
    private final String name;
    private final String department;
    private final int age;
    private final String userName;
    private final int studentNumber;
    private final boolean fullTime;

    /* declare the construction function for this class */
    public StudentMain(Object average, double programming, double webDev, double maths,
                       double algorithms, String name, String department, int age, String userName,
                       int studentNumber, boolean fullTime) {
        this.average = average;
        this.programming = programming;
        this.webDev = webDev;
        this.maths = maths;
        this.algorithms = algorithms;
        this.name = name;
        this.department = department;
        this.age = age;
        this.userName = userName;
        this.studentNumber = studentNumber;
        this.fullTime = fullTime;
    }
}
