
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
    public Grade(double programming, double webDev, double maths, double algorithms) {
        this.programming = programming;
        this.webDev = webDev;
        this.maths = maths;
        this.algorithms = algorithms;
        this.progGrade = getLetterGrade(programming);
        this.webGrade = getLetterGrade(webDev);
        this.mathGrade = getLetterGrade(maths);
        this.algGrade = getLetterGrade(algorithms);
    }

    /* declare getters */
    public String getProgGrade() {return progGrade;}
    public String getWebGrade() {return webGrade;}
    public String getMathGrade() {return mathGrade;}
    public String getAlgGrade() {return algGrade;}

    /* declare method to return the correspondent grade for each module */
    public static String getLetterGrade(double score) {

        String grade = "";

        if (score < 0 || score > 100){
            grade = "E"; // error
        }
        else if (score >= 70) {
            grade = "A";
        }
        else if (score >= 60) {
            grade = "B";
        }
        else if (score >= 50) {
            grade = "C";
        }
        else if (score >= 40) {
            grade = "D";
        }
        else if( score < 40) {
            grade = "F";
        }
        return grade;
    }
}
