package Basics;

public class MainClass extends Person {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=20;
        p.name="Ahashan";
        System.out.println(p.name+" - "+ p.age);
    }

}

class Person{
    String name;
    int age;
}