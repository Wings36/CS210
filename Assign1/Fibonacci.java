public class Fibonacci {
    public static void main(String args[]) {
        int tempNum = 0;
        int total = 0;
        int amountOfNumbers = 12;
        for (int x = 0; x < amountOfNumbers; x++) {
            if (total == 0) {
                total = 1;
            } else {
                int tempNumTwo = tempNum;
                tempNum = total;
                total = total + tempNumTwo;
            }
            System.out.print(total + " ");
        }
    }
}
