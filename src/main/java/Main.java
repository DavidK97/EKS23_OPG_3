public class Main {

    public static void main (String [] args) {

        //TODO Junit-test og klassediagram
        //TODO hvis en student har taget et fag, så skal en fejlbesked vises
        //TODO for at kunne tilføje et Course til en student så skal der tjekkes at skolen har faget
        Academy academy = new Academy();

        Student student1 = new Student("David", 27, 1);


        Course databaser = new Course("Databaser");
        Course webprogrammering = new Course("Webprogrammering");
        Course systemudvikling = new Course("Systemudvikling");

        academy.addCourse(databaser);
        academy.addCourse(webprogrammering);
        academy.addCourse(systemudvikling);


        student1.addCourse(databaser, 7);
        student1.addCourse(webprogrammering, 7);
        student1.addCourse(systemudvikling, 10);
        student1.addCourse(databaser, 4);


        academy.addStudent(student1);


        academy.printDiploma(student1);
    }
}
