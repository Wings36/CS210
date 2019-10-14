import java.util.*;
public class Distance {
    public static double distance(double xOne, double yOne, double xTwo, double yTwo)
    {
        return Math.sqrt(Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));
    }
    public static void main(String[] args)
    {
        //Initialize variables
        double xOne, xTwo, yOne, yTwo, result;

        //asking user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        xOne = input.nextDouble();
        System.out.println("Enter y1:");
        yOne = input.nextDouble();
        System.out.println("Enter x2:");
        xTwo = input.nextDouble();
        System.out.println("Enter y2:");
        yTwo = input.nextDouble();

        input.close();
        //Run method
        result = distance(xOne, yOne, xTwo, yTwo);

        //Display results
        System.out.println("The distance between those 2 points are " + result + " units.");

    }
}
