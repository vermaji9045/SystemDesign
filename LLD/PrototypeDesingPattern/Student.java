package PrototypeDesingPattern;

public class Student implements Prototype {

   private int rollnum;
    private int age;
    private String Name;

    Student(int age,String Name,int rollnum)
    {
       this.Name=Name;
       this.age=age;
       this.rollnum=rollnum;
    }
    @Override
    public Prototype clonee() {
       
        return new Student(age,Name,rollnum);
    }

    public void print()
    {
      System.out.println("Name: " + Name + " Age: " + age + " RollNumber: " + rollnum );
    }



}
