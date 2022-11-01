package homework;

//Write a Java program to iterate through all elements in an array list using Iterator.


import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
