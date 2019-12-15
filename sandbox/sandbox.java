import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Random;
public class sandbox {
    public static void main(String[] args) throws FileNotFoundException {

        for (int x = 0; x < 15; x++)
        {
            int num = (int) (Math.random() * 900) + 100;
            int numTwo = (int) (Math.random() * 900) + 100;
            System.out.println(num + "  " + numTwo);
        }
    }
}
