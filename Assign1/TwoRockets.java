public class TwoRockets {

    static void cone()
    {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    static void body()
    {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    static void brand()
    {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }

    public static void main(String[] args)
    {
        cone();
        body();
        brand();
        body();
        cone();
        }
    }

