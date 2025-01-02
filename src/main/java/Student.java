import java.util.HashSet;
import java.util.Set;

public class Student {
    private static int studentId = 0;
    private String name;
    private int age;
    private int schoolYear;
    private Set <Course> coursesCompleted;

    public Student (String name, int age, int schoolYear){
        this.name = name;
        this.age = age;
        this.schoolYear = schoolYear;
        this.coursesCompleted = new HashSet<>();
        studentId++;
    }


    public void addCourse (Course course, int grade) {
        if (grade == -3 || grade == 00 || grade == 02 || grade == 4 || grade == 7 || grade == 10 || grade == 12) {
            course.setGrade(grade);
            coursesCompleted.add(course);
        }
    }


    //TODO skal fikses så courses navn er med
    public String toString (){
        return getName();
    }

    //getters and setters
    public String getName () {
        return name;
    }

    public int getAge (){
        return age;
    }

    public int getSchoolYear () {
        return schoolYear;
    }

    public int getStudentId () {
        return studentId;
    }

    public Set<Course> getCoursesCompleted () {
        return coursesCompleted;
    }


}
