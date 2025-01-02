public class Course {
    private String name;
    private int grade;

    //TODO eventuelt tilføj fejlbesked
    public Course (String name, int grade){
        if (grade == -3 || grade == 00 || grade == 02 || grade == 4 || grade == 7 || grade == 10 || grade == 12) {
            this.name = name;
            this.grade = grade;
        }
    }

    public Course (String name) {
        this.name = name;
    }

    public String toString () {
        return getName() + ": " + getGrade();
    }

    public String getName (){
        return name;
    }

    public int getGrade () {
        return grade;
    }

    public void setGrade (int grade) {
            this.grade = grade;
    }
}
