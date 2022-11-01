package calculate;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.N;
import static javafx.scene.input.KeyCode.Y;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number : ");
            int x = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int y = scanner.nextInt();
            System.out.println("Enter the operator (+,-,/ or *) : ");
            char ch = scanner.next().charAt(0);
            Calculator calculator = new Calculator();

            try {
                calculator.calculateResult(x, y, ch);
            } catch (Exception e) {
                System.out.println("Invalid operation ");
            }
            System.out.println("Would you like to do more calculation \n" + " Please enter Y or N ");
            char ans = scanner.next().charAt(0);

            if (ans == 'n') {
                break;
            }
        }
        scanner.close();
    }
}
