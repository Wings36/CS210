import java.util.*;
public class allDigitsOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to test: ");
        int number = input.nextInt();
        input.close();
        if (allOddTester(number)) {
            System.out.println("All the numbers are odd.");
        }
        else {
            System.out.println("Not all the numbers are odd.");
        }

    }

    public static Boolean allOddTester (int number)
    {
        int test;
        while (number != 0) {
            test = number % (10);
            number = number / 10;
            if (test % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
