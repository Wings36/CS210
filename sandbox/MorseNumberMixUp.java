import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseNumberMixUp {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        File answer = new File("answer.txt");
        PrintStream file = new PrintStream(answer);
        System.out.println("How many numbers?");
        int count = input.nextInt();
        int firstAnws = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> equation = new ArrayList<String>();
        ArrayList<String> questions = new ArrayList<String>();

        for (int x = 0; x < count; x++) {
            int num = (int) (Math.random() * 900) + 100;
            numbers.add(num);
            equation.add(findNum(num));
        }

        int max = count - 1;
        int min = 0;
        int maxTwo = count - 1;
        int minTwo = 0;
        for (int x = 0; x < count; x++) {
            int range = max - min + 1;
            int rangeTwo = maxTwo - minTwo + 1;
            int numSelect = numbers.get((int) (Math.random() * range) + min);
            String equationSelect = equation.get((int) (Math.random() * rangeTwo) + minTwo);
            file.print((x + 1) + ". " + equationSelect + "   -->  " + numSelect);
            file.println();
            String format = "";
            format = "\n\n\n\n" + morseTrans(Integer.toString(numSelect)) + "\n\n" + morseTrans(equationSelect);
            questions.add(format);
            max = max - 1;
            maxTwo = maxTwo - 1;
        }
        max = count - 1;
        min = 0;
        for (int x = 0; x < count; x++) {
            int range = max - min + 1;
            System.out.println(questions.get((int) (Math.random() * range) + min));
            max = max - 1;
        }
    }

    public static String morseTrans(String num)
    {

        String morse = "";
        Scanner number = new Scanner(num).useDelimiter("");
        while(number.hasNext())
        {
            String test = number.next();
            if (test.equals("1"))
                morse = morse + "/--- / -. / .";
            else if (test.equals("2"))
                morse = morse + "/- / .-- / ---";
            else if (test.equals("3"))
                morse = morse + "/- / .... / .-. / . / .";
            else if (test.equals("4"))
                morse = morse + "/..-. / --- / ..- / .-.";
            else if (test.equals("5"))
                morse = morse + "/..-. / .. / ...- / .";
            else if (test.equals("6"))
                morse = morse + "/... / .. / -..-";
            else if (test.equals("7"))
                morse = morse + "/... / . / ...- / . / -.";
            else if (test.equals("8"))
                morse = morse + "/. / .. / --. / .... / -";
            else if (test.equals("9"))
                morse = morse + "/-. / .. / -. / .";
            else if (test.equals("0"))
                morse = morse + "/--.. / . / .-. / ---";
            else if (test.equals("+"))
                morse = morse + "/+/";
        }
        number.close();

        //String morse = num;
        return morse;
    }

    public static String findNum(int number) {
        Boolean test = true;
        int max = 999;
        int min = 1;
        int range = max - min + 1;
        Scanner input = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        while (test) {
            numOne = (int) (Math.random() * range) + min;
            numTwo = (int) (Math.random() * range) + min;
            numThree = (int) (Math.random() * range) + min;

            if (numOne + numTwo + numThree == number) {
                break;
            }
        }
        return numOne + "+" + numTwo + "+" + numThree;
    }
}
