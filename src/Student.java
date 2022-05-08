
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

import java.util.ArrayList;
import java.util.Locale;

/* declare class student */
public class Student {

    /* create ArrayList to store student grade for each module */
    public ArrayList<Grade> grades = new ArrayList<>();

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

    /* declare getters */
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

        /* add to array the grade from the student */
        grades.add(new Grade(programming, webDev, maths, algorithms));

        /* convert the student number to a string to build the username */
        String studentNumber_String = String.valueOf(studentNumber);
        /* store the first letter of the name the student */
        String nameLowerCase = this.name.substring(0,1);
        /* find the position is the space between the name and the surname */
        int posSpace = this.name.indexOf(" ");
        /* store the 4 letters of the student surname */
        String surnameLowerCase = this.name.substring(posSpace + 1, posSpace + 5);
        /* create the username using concatenation method */
        this.userName = nameLowerCase.toLowerCase(Locale.ROOT) + surnameLowerCase.toLowerCase(Locale.ROOT) +
                studentNumber_String.substring(0,3);
    }

    /* override method toString */
    public String toString() {
        return "Student Name = " + name + ", Department = " + department + ", Age = " +
                age + "\n" + " -> Username = " + userName + ", Student No. " + studentNumber + ", Full Time = " +
                fullTime + "\n" + " -> Programming = " + programming + "% " + grades.get(0).getProgGrade() +
                ", Web Dev = " + webDev + "% " + grades.get(0).getWebGrade() +
                ", Maths = " + maths + "% " + grades.get(0).getMathGrade() +
                ", Algorithms = " + algorithms  + "% " + grades.get(0).getAlgGrade();
    }
}
