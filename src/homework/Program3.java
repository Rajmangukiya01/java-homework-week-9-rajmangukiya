package homework;

//Write a Java program to reverse an array of integer values.

public class Program3 {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        //Initialize array
        int[] a = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println("Original array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Reverse order array : ");

        //Array in reverse order
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
