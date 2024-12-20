import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Academy {
    private Set <Course> allCourses;
    private List <Student> allStudents;

    public Academy () {
        this.allCourses = new HashSet<>();
        this.allStudents = new ArrayList<>();
    }

    //TODO toString () skal fikses så navn på courses printes
    public void printDiploma (Student student) {
        System.out.println(student.getCoursesCompleted());
        calculateAverage(student);
    }

    public List<Student> getHighest (int amount){
        return null;
    }

    public List <Student> getLowest (int amount){
        return null;
    }

    //TODO skal have 'value' fra en students coursesCompleted
    //TODO brug for en list måske?
    public float calculateAverage (Student student) {
        int average = 0;
        student.getCoursesCompleted().forEach();
        return average;
    }




    //getter and setters
    public Set <Course> getAllCourses () {
        return allCourses;
    }

    public List <Student> getAllStudents () {
        return allStudents;
    }
}
