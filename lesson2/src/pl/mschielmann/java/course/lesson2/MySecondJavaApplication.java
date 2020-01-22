package pl.mschielmann.java.course.lesson2;

public class MySecondJavaApplication {

    public static void main(String[] args) {
        System.out.println("Hello again! Let me introduce you to someone.");

        Person person1 = new Person();
        person1.name = "Henry";
        person1.surname = "Smith";
        person1.age = 42;

        System.out.println("This is " + person1.name + " " + person1.surname + " and he is " + person1.age + ".");
        person1.introduceSelf();

        Person someOtherPerson = new Person();
        someOtherPerson.name = "Jane";
        someOtherPerson.surname = "Doe";
        someOtherPerson.age = 51;

        System.out.println("And this is " + someOtherPerson.name +
                " " + someOtherPerson.surname + " and she is " + someOtherPerson.age + ".");
        someOtherPerson.introduceSelf();

        System.out.println("That's all folks!");
    }
}

class Person {
    String name;
    String surname;
    Integer age;

    void introduceSelf() {
        System.out.println("Hi, I'm " + this.name + " " + this.surname + ". I'm " + this.age + " years old.");
    }
}
