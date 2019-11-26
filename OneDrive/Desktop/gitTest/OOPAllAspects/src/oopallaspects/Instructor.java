package oopallaspects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bia_a
 */
public class Instructor extends Person {

   

    
    
    
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void create() {
        System.out.println("The instructor with the name " + getName() + "has been created.");
    }

    @Override
    public void read() {
        System.out.println("The instructor's details are: " + getName());
    }

    @Override
    public void update() {
        System.out.println("The instructor with the name " + getName() + "has been updated.");
    }

    @Override
    public void delete() {
        System.out.println("The instructor with the name " + getName() + "has been deleted.");
    }

    @Override
    public String toString() {
        return "Instructor: " + getName();
    }

}
