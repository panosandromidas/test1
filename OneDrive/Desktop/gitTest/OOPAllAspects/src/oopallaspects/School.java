/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopallaspects;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bia_a
 */
public class School {

    private String name;
 
    private final List<Student> students;
    private final List<Instructor> instructors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }
    

    private Student studentFromCmd (){
        System.out.println("You want to add your own student ok");
        System.out.println("Give student's name");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        return new Student(studentName);
    }
    
     private Instructor instructorFromCmd (){
        System.out.println("You want to add your own instructor ok");
        System.out.println("Give instructor's name");
        Scanner sc = new Scanner(System.in);
        String instructorName = sc.nextLine();
        return new Instructor(instructorName);
    }
    

    public School() {
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.students.add(studentFromCmd());
        this.students.add(new Student("Nikolas Petropoulos"));
        this.instructors.add(instructorFromCmd());
        this.instructors.add(new Instructor("Anastasios Lelakis"));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("The school's name is: ");
        sb.append(this.name);
        sb.append("\nIts instructors are: ");
        for (Instructor instructor : instructors) {
            sb.append("\n");
            sb.append(instructor);

        }
        sb.append("\nand its students are: ");
        for (Student student : students) {
            sb.append("\n");
            sb.append(student);

        }

        return sb.toString();
    }

}
