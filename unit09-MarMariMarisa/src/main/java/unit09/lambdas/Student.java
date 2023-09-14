package unit09.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * A class that represents a student with a first and last na
 */
public class Student implements Comparable<Student> { // remove Comparable
    /**
     * The student's first name.
     */
    private final String firstName;

    /**
     * The student's last name.
     */
    private final String lastName;

    /**
     * Creates a new student.
     * 
     * @param firstName The new student's first name.
     * @param lastName The new student's last name.
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student other) {
        return this.firstName.compareTo(other.firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "{" + this.lastName + ", " + this.firstName + "}";
    }
    public static int compareByFirstName(Student st1,Student st2){
        return st1.compareTo(st2);
    }
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("John","Smith"));
        students.add(new Student("Tom","Brown"));
        students.add(new Student("Mary","Johnson"));
        System.out.println(students);
        //local class
        // class StudentComparator implements Comparator<Student>{
        //     @Override
        //     public int compare(Student arg0,Student arg1){
        //         return arg0.getLastName().compareTo(arg1.getLastName());
        //     }
        // }

        //anonymous class expression
        // students.sort(new Comparator<Student>(){
        //     @Override
        //     public int compare(Student arg0,Student arg1){
        //         return arg0.getLastName().compareTo(arg1.getLastName());
        //     }
        // }
        // );

        // Comparator<Student> comparator = (arg0,arg1) -> {
        //     return arg0.getLastName().compareTo(arg1.getLastName());
        // };

        // Comparator<Student> comparatorTwo = (arg0,arg1) -> arg1.getLastName().compareTo(arg0.getLastName());
        // students.sort(comparator);
        // System.out.println(students);
        // students.sort(comparatorTwo);
        // // System.out.println(students);

        // //Method Reference
        // students.sort(Student::compareByFirstName);

        students.stream().forEach((e)->{
            System.out.println(e.getFirstName() + " " + e.getLastName());
        });

        students.stream().filter((e)->{return e.getFirstName().contains("t");
        }).forEach((e) -> {
        System.out.println(e.getFirstName() + " " + e.getLastName());
    });

        
    }
}
