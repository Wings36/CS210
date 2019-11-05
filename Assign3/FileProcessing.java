import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class FileProcessing {
    public static void main(String[] args) throws IOException {
        File file = new File("./Assign3/Sacramentorealestatetransactions.csv");
        PrintStream write = new PrintStream(new File("./Assign3/output.txt"));
        Scanner input = new Scanner(file);

        System.out.println("Houses above $500k");
        write.println("Houses above $500k");
        //skips first line
        input.next();
        input.useDelimiter(",");

        while(input.hasNext())
        {
            String street = input.next();
            String city = input.next();
            input.next();
            input.next();
            input.next();
            input.next();
            int size = input.nextInt();
            input.next();
            input.next();
            int price = input.nextInt();
            input.nextLine();

            if(price > 500000)
            {
                String output = street + ", " + city + ", " + size + ", " + price ;
                System.out.println(output);
                write.println(output);
            }

        }
        write.close();
    }
}
