package homework;

/* Write a Java program to retrieve an element (at a specified index) from a given
   array list */

import java.util.ArrayList;

public class Program6 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        ArrayList<String> list = new ArrayList();
        list.add("London");
        list.add("Canada");
        list.add("America");
        list.add("Australia");
        list.add("India");

        System.out.println("The ArrayList is : " + list.get(2));
    }
}
