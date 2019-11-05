import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Random;
public class sandbox {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./Assign3/words.txt");
        Scanner wordLook = new Scanner(file);
       // int wordSelect = rand.nextInt(fileCounter(wordLook));
        for (int x = 0; x < 51; x++)
            System.out.println(wordLook.next());
        String word = wordLook.next();
    }
}
