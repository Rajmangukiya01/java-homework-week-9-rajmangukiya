package homework;

/* Write a Java program to create a new array list, add some colours (string) and
   printout the collection using for each loop */

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.colours();
    }

    public void colours() {
        ArrayList<String> colorName = new ArrayList();
        colorName.add("Black");
        colorName.add("Blue");
        colorName.add("Green");
        colorName.add("Yellow");
        colorName.add("White");

        for (String str : colorName) {
            System.out.println(str);
        }
    }
}
