import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Random;
public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        List<String> wordImport = new ArrayList<String>();
        File file = new File("./Assign3/words.txt");
        Scanner wordLook = new Scanner(file);

        fileReader(wordLook, wordImport);
        int wordSelect = rand.nextInt(wordImport.size());

        String word = wordImport.get(wordSelect);

        char[] wordTest = word.toCharArray();
        char [] hangman = "HANGMAN".toCharArray();

        System.out.println("There are " + wordTest.length + " letters");
        System.out.println("Start!");
        if(gameHangman(wordTest, hangman))
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("VICTORY");
        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Defeat");
        }

    }

    public static Boolean gameHangman(char[] word, char[] hangman)
    {
        int lives = 7;
        int winScore = word.length;
        int score = 0;
        Scanner input = new Scanner(System.in);
        char[] answer = new char[winScore];
        char guesses[];
        Boolean fail = true;
        for (int x = 0; x < answer.length; x++)
        {
            answer[x] = '_';
        }
        boolean alive = true;
        while(alive)
        {

            System.out.println();
            System.out.println();
            System.out.println();
            arrayPrint(hangman);
            System.out.println();
            System.out.println();
            arrayPrint(answer);
            if (score == winScore)
            {
                return true;
            }
            if (lives == 0)
            {
                return false;
            }
            System.out.println();
            System.out.print("Enter a letter to guess: ");
            char userGuess = input. next().charAt(0);
            for (int x = 0; x < winScore; x++)
            {
                if (word[x] == userGuess)
                {
                    answer[x] = word[x];
                    score++;
                    fail = false;
                }
            }
            if (fail)
            {
                hangman[lives - 1] = '_';
                lives--;
            }
            fail = true;
        }
        System.out.println("Error");
        return false;
    }

    public static void arrayPrint(char[] array)
    {
        for (int x = 0; x < array.length ; x++)
        {
            System.out.print(array[x] + "  ");
        }
    }

    public static void fileReader(Scanner file, List<String> array)
    {
        int count = 0;
        while (file.hasNextLine()) {;
            array.add(file.next());
            count++;
        }
    }
}
