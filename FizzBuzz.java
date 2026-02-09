import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input valid integer number to print FizzBuzz : ");
        String input = scan.nextLine();

        if (isValid(input)) {
            generate(Integer.parseInt(input));
        } else {
            System.out.println("Non integer value detected, please input valid integer!");
        }

    }

    static boolean isValid(String value) {
        try {
            int number = Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;

        }
    }

    static void generate(int value) {
        for (int i = 1; i <= value; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
