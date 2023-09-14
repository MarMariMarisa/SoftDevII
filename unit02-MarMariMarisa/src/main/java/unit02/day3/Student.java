package unit02.day3;

public class Student {
    private String name;
    private int age;
    private static String school;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        school = "RIT";
    }
    public String getName(){
        return name;
    }
    public static String getSchool(){
        return school;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return getName() + ", " + getAge();
    }
    public void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args){
        Student student1 = new Student("John",20);
        String name1 = student1.getName();
        System.out.println(name1);
        String schoolName = getSchool()


    }
}
