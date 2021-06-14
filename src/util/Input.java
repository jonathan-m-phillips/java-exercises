package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Input a string: ");
        String string = scanner.nextLine();
        System.out.println(string);
        return string;
    }

    public boolean yesNo() {
        System.out.println("Do you like cheetos? y/n");
        String yesNo = scanner.nextLine();
        if (yesNo.equals("yes") || yesNo.equals("y")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public int getInt(int min, int max) {

        int number;

        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            number = scanner.nextInt();

            if (number >= min && number <= max) {
                System.out.println(number);
                break;
            } else {
                System.out.println("Enter a number between " + min + " and " + max + ".");
                number = scanner.nextInt();
            }
        } while(number < min || number > max);

        return number;

    }

    public double getDouble(double min, double max) {
        double number;

        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            number = scanner.nextDouble();

            if (number >= min && number <= max) {
                System.out.println(number);
                break;
            } else {
                System.out.println("Enter a number between " + min + " and " + max + ".");
                number = scanner.nextDouble();
            }
        } while(number < min || number > max);

        return number;
    }


    public static void main(String[] args) {
        Input input = new Input();

        input.getString();
        input.yesNo();
        input.getInt(1, 10);
        input.getDouble(1.0, 10.0);

    }

}
