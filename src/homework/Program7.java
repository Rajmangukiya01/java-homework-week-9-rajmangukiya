package homework;

import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
        //ArrayList of String Type
        ArrayList<String> al = new ArrayList();
        //Checking whether the list is empty
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

        //Adding String elements
        al.add("Central");
        al.add("Metropolitan");
        al.add("Jubilee");
        al.add("Northern");

        //Again check for isEmpty
        System.out.println("Is Array Empty: " + al.isEmpty());
    }
}
