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


    public void printDiploma (Student student) {
        System.out.println(student.getName());
        for (Course course: student.getCoursesCompleted()) {
            System.out.println(course);
        }
        System.out.println("Gennemsnit: " + calculateAverage(student));
    }

    //TODO
    public List<Student> getHighest (int amount){
        return null;
    }

    //TODO
    public List <Student> getLowest (int amount){
        return null;
    }


    public float calculateAverage (Student student) {
        float total = 0;
       for (Course course : student.getCoursesCompleted()) {
           total = total + course.getGrade();
       }
        return total/student.getCoursesCompleted().size();
    }


    public void addStudent (Student student) {
        allStudents.add(student);
    }

    public void addCourse (Course course) {
        allCourses.add(course);
    }







    //getter and setters
    public Set <Course> getAllCourses () {
        return allCourses;
    }

    public List <Student> getAllStudents () {
        return allStudents;
    }
}
