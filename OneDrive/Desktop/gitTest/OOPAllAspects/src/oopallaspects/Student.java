
package oopallaspects;

/**
 *
 * @author bia_a
 */
public class Student extends Person {
    
    public Student(String name) {
        super(name);
    }
    
    
      @Override
    public void create() {
        System.out.println("The student with the name "+getName()+ "has been created.");
    }

    @Override
    public void read() {
       System.out.println("The student's details are: "+getName());
    }

    @Override
    public void update() {
      System.out.println("The student with the name "+getName()+ "has been updated.");   
    }

    @Override
    public void delete() {
      System.out.println("The student with the name "+getName()+ "has been deleted."); 
    }

 
    @Override
    public String toString() {
        return "Student: " + getName();
    }


    
    
}
