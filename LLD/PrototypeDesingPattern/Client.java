package PrototypeDesingPattern;

public class Client {

    public static void main(String[] args) {
        
        Student s1=new Student(12, "Sandeep", 19);
        s1.print();
        Student s2=(Student)s1.clonee();
        System.out.println("Clone Object");
        s2.print();

    }

}
