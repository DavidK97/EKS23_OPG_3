public class Main {

    public static void main (String [] args) {

        Academy academy = new Academy();

        Student student1 = new Student("David", 27, 1);
        Course course1 = new Course("Databaser");
        Course course2 = new Course("Webprogrammering");

        student1.addCourse(course1, 7);

        System.out.println(student1.getCoursesCompleted().values());

       // academy.printDiploma(student1);
    }
}
