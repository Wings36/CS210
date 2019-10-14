import java.util.*;
public class Midpoints {
    public static void main(String[] args) {
        int one,two,three;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers below to test for a midpoint. Press enter after each number to submit:");
        one = input.nextInt();
        two = input.nextInt();
        three = input.nextInt();

        System.out.println(hasMidpoint(one,two,three));
    }

    public static Boolean hasMidpoint(int first, int second, int third) {
        //comparing to third
        int methodOne = first + second;
        //comparing to second
        int methodTwo = first + third;
        //comparing to first
        int methodThree = second + third;
        return methodOne / 2 == third || methodTwo / 2 == second || methodThree / 2 == first;
    }

}
