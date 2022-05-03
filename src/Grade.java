
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 03/05/2022
 */

/* declare class grade */
public class Grade {

    /* declare instances variables */
    public double programming;
    public double webDev;
    public double maths;
    public double algorithms;
    public String progGrade;
    public String webGrade;
    public String mathGrade;
    public String algGrade;

    /* declare the construction function for this class */
    public Grade(double programming, double webDev, double maths, double algorithms, String progGrade,
                 String webGrade, String mathGrade, String algGrade) {
        this.programming = programming;
        this.webDev = webDev;
        this.maths = maths;
        this.algorithms = algorithms;
        this.progGrade = progGrade;
        this.webGrade = webGrade;
        this.mathGrade = mathGrade;
        this.algGrade = algGrade;
    }

    /* declare getters */
    public double getProgramming() {return programming;}
    public double getWebDev() {return webDev;}
    public double getMaths() {return maths;}
    public double getAlgorithms() {return algorithms;}
    public String getProgGrade() {return progGrade;}
    public String getWebGrade() {return webGrade;}
    public String getMathGrade() {return mathGrade;}
    public String getAlgGrade() {return algGrade;}
}
