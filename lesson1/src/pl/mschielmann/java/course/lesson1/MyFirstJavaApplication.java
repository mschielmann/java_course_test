package pl.mschielmann.java.course.lesson1;

import java.util.Date;

public class MyFirstJavaApplication {

    public static void main(String[] args) {
        System.out.println("Hello! I'm your first Java Application");

        Integer someNumber = 42;
        String someWords = "Today is ";
        Date today = new Date();

        System.out.print(someWords);
        System.out.println(today);
        System.out.println("And the meaning of life is: " + someNumber);

        System.out.println("That's all folks!");
    }
}
