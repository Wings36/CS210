import java.util.*;
public class Vertical {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String temp;
        System.out.println("Welcome to the vertical printer");
        System.out.println("Enter anything:");
        temp = input.nextLine();
        input.close();
        System.out.println();
        vertical(temp);
    }

    public static void vertical(String input)
    {
        for (int x = 0; x < input.length(); x++)
        {
            System.out.println(input.charAt(x));
        }
    }
}
