package oopallaspects;

import java.util.ArrayList;

/**
 *
 * @author bia_a
 */
public class OOPAllAspects {

    public static void main(String[] args) {

        Person person = new Person("George Anagnostou");

        Student student = new Student("Michalis Ioannou");
        Student student1 = new Student("Nikos Apostolou");
        Student student2 = new Student("Petros Efthimiou");

        Instructor instructor = new Instructor("George Pasparakis");
        Instructor instructor1 = new Instructor("Tasos Lelakis");
        Instructor instructor2 = new Instructor("Spiros Mavros");

        //Inheritance grouping μέσω του Person που είναι η superclass
        System.out.println("\nInheritance grouping");
        ArrayList<Person> inheritanceList = new ArrayList<>();
        inheritanceList.add(person);
        inheritanceList.add(student);
        inheritanceList.add(student1);
        inheritanceList.add(student2);
        inheritanceList.add(instructor);
        inheritanceList.add(instructor1);
        inheritanceList.add(instructor2);

        for (Person p : inheritanceList) {
            System.out.println(p);
        }

        //Interface grouping
        System.out.println("\nInterface grouping");
        Product product1 = new Product();
        Product product2 = new Product();
        product1.setName("My First Product");
        product2.setName("My Second Product");

        //Εφόσον έχουν κοινό το Interface τα Person,Student,Instructor και Product
        //φτιάχνω arraylist της interface
        ArrayList<Crudable> interfacesGrouping = new ArrayList<>();
        interfacesGrouping.add(person);
        interfacesGrouping.add(student);
        interfacesGrouping.add(student1);
        interfacesGrouping.add(student2);
        interfacesGrouping.add(instructor);
        interfacesGrouping.add(instructor1);
        interfacesGrouping.add(instructor2);
        interfacesGrouping.add(product1);
        interfacesGrouping.add(product2);

        for (Crudable c : interfacesGrouping) {
            System.out.println(c);
        }

        //Association Example = Βάζω ότι σχέση θέλω στο sout
        System.out.println("----------Association----------");
        System.out.println(instructor.getName() + " has as students: " + student.getName() + ", " + student1.getName());
        System.out.println(student2.getName() + " has as instructors: " + instructor1.getName() + " ," + instructor2.getName());

        //Aggregation Example -Έφτιαξα μια λίστα μέσα στον instructor που παίρνει μαθητές 
        //και μέσω της getter και add προσθέτω τους μαθητές στον κάθε καθηγητή
        System.out.println("----------Aggregation----------");
        instructor1.getStudents().add(student);
        instructor1.getStudents().add(student1);
        System.out.println("Instructor with name: " + instructor1.getName() + " has the following students: ");

        for (Student s : instructor1.getStudents()) {
            System.out.println(s.getName());
        }

        //Composition Example 
        System.out.println("----------Composition----------");
        School s1 = new School();
        s1.setName("Coding bootcamp 9");
       
        System.out.println(s1);
    }

}
