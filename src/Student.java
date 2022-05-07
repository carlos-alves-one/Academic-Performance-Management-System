
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

/* declare class student */
public class Student {

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
    //private final String userName;
    private final int studentNumber;
    private final boolean fullTime;

    /* declare setters and getters */
    static boolean isFailedModule() {return failedModule;}
    public double getProgramming() {return programming;}
    public double getWebDev() {return webDev;}
    public double getMaths() {return maths;}
    public double getAlgorithms() {return algorithms;}
    public double getAverage() {return (double) average;}
    public String getName() {return name;}
    public void setFailedModule(boolean failedModule) {this.failedModule = failedModule;}

    /* declare the construction function for this class */
    public Student (String name, String department, int age, int studentNumber, boolean fullTime,
                    double programming, double webDev, double maths, double algorithms) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.studentNumber = studentNumber;
        this.fullTime = fullTime;
        this.programming = programming;
        this.webDev = webDev;
        this.maths = maths;
        this.algorithms = algorithms;
        this.average = Average.calcAverage(programming, webDev, maths, algorithms);
    }
}
