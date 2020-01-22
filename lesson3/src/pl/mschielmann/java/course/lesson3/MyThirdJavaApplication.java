package pl.mschielmann.java.course.lesson3;

public class MyThirdJavaApplication {
    public static void main(String[] args) {
        Person person1 = new Person("Henry", "Smith", 33);
        Person person2 = new Person("Jane", "Doe", 54);
        Person person3 = new Person("Joe", "Harris", 78);

        person1.introduceSelf();
        person2.introduceSelf();
        person3.introduceSelf();

        System.out.println();
        System.out.println("Person1 name: " + person1.getName());
        System.out.println("Person2 surname: " + person2.getSurname());
        System.out.println("Person3 age: " + person3.getAge());

        System.out.println();
        System.out.println("Lets try to update their ages.");
        int newAge = 34;
        System.out.println("Trying to set " + person1.getName() + " to " + newAge);
        person1.setAge(newAge);
        person1.introduceSelf();
        System.out.println();

        newAge = 54;
        System.out.println("Trying to set " + person2.getName() + " to " + newAge);
        person2.setAge(newAge);
        person2.introduceSelf();
        System.out.println();

        newAge = 69;
        System.out.println("Trying to set " + person3.getName() + " to " + newAge);
        person3.setAge(newAge);
        person3.introduceSelf();
        System.out.println();

        System.out.println("That's all folks!");
    }
}
