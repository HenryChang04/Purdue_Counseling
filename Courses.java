import java.util.ArrayList;

public class Courses {

    String courseName;
    String titleOfCourse;
    double numberOfCredits;
    public Courses(String n){
        this.courseName = n;
        this.titleOfCourse = courseName.substring(0,courseName.lastIndexOf(' '));
        this.numberOfCredits= Double.parseDouble(courseName.substring(courseName.lastIndexOf(' ')));
    }
    public String getTitleOfCourse(){
        return titleOfCourse;
    }

    public double getNumberOfCredits() {
        return numberOfCredits;
    }
}
