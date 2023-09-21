import java.util.Scanner;

public class H7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char operation = ' ';

        boolean validInput = false;
        do {
            System.out.print("Sisesta esimene number: ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Sisestatud number pole number. palun proovi uuesti.");
                scanner.next(); 
            }
        } while (!validInput);

        validInput = false;
        do {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Sisestatud number pole number. palun proovi uuesti.");
                scanner.next();
            }
        } while (!validInput);

        validInput = false;
        do {
            System.out.print("Vali matemaatika symbol (+, -, *, /): ");
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                operation = input.charAt(0);
                validInput = true;
            } else {
                System.out.println("Sisestatud symbol pole saadaval. palun proovi uuesti");
            }
        } while (!validInput);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("jagamine nulliga ei ole lubatud.");
                }
                break;
        }

        System.out.println("tehe: " + result);

        scanner.close();
}
}
