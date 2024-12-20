import java.util.HashMap;

public class Student {
    private static int studentId = 0;
    private String name;
    private int age;
    private int schoolYear;
    private HashMap <Course, Integer> coursesCompleted;

    public Student (String name, int age, int schoolYear){
        this.name = name;
        this.age = age;
        this.schoolYear = schoolYear;
        this.coursesCompleted = new HashMap <Course, Integer> ();
        studentId++;
    }

    //TODO sørg for at de kun er karaktere ma kan indtaste
    public void addCourse (Course course, Integer grade) {
        coursesCompleted.put(course, grade);
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

    public HashMap <Course, Integer> getCoursesCompleted () {
        return coursesCompleted;
    }
}
