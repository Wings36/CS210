import java.util.*;
public class Palindromes {

    public static void printPalindrome(Scanner userInput)
    {
        String input, process;
        String copy = "";

        System.out.print("Enter a word to test: ");
        input = userInput.nextLine();

        //corrections
        process = input.toLowerCase();
        process.replaceAll("\\s", "");

        //copying
        for(int k = process.length() - 1; k >= 0; k--)
        {
            copy += process.charAt(k);
        }
        //testing
        //System.out.println(copy);
        if (copy.compareTo(process) == 0)
        {
            System.out.println(input + " is a palindrome.");
        }
        else
        {
            System.out.println(input + " is not a palindrome.");
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        printPalindrome(input);
        input.close();
    }
}
