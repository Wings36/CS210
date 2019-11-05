import java.util.Arrays;
import java.util.Random;
public class MinGapCalculator {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] num = new int[rand.nextInt(51)];
        for (int x = 0; x < num.length; x++)
        {
            num[x] = rand.nextInt(101);
        }
        System.out.println("The array will be " + Arrays.toString(num));
        System.out.println("The smallest gap is " + minGap(num));
    }

    public static int minGap(int[] num)
    {
        int y = 0;
        int min = 0;
        for (int x = 1; x < num.length; x++)
        {
            int test = num[x] - num[y];
            if (test < min)
                min = test;
            y++;
        }
        return min;
    }
}
