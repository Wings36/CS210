import java.util.*;
public class Gradebook {
    public static int testFullPoints;
    public static void main(String[] args) {
        String studName;
        int assignCount;
        int midtermMax;
        int midtermEarned;
        int finalMax;
        int finalEarned;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        studName = input.nextLine();
        System.out.println();
        System.out.println("Enter the amount of Assignments were given to the student.");
        assignCount = input.nextInt();
        //Database for assignments created
        ArrayList<Integer> assignFullPoints = new ArrayList<Integer>(assignCount);
        ArrayList<Integer> assignScore = new ArrayList<Integer>(assignCount);
        ArrayList<String> assignName = new ArrayList<String>(assignCount);


        //assignments
        if (assignCount > 0)
        {
            AssignProcess(assignFullPoints, assignScore, assignName,assignCount);
            AssignConfirm(assignFullPoints, assignScore, assignName);
        }

        //testProcess(testFullPoints, testScore, testName);
        //test scores


        //System.out.println(assignFullPoints);



    }

    public static void testProcess(ArrayList<Integer> fullTestScore, ArrayList<Integer> testScore, ArrayList<String> name)
    {
        String title ="Tests";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the total amount of possible points for the midterm exam: " );
        fullTestScore.add(userInput.nextInt());
        System.out.println("Enter the amount of points earned on the midterm by the student: ");
        testScore.add(userInput.nextInt());
        System.out.println("Enter the total amount of possible points for the final exam: " );
        fullTestScore.add(userInput.nextInt());
        System.out.println("Enter the amount of points earned on the final by the student: ");
        testScore.add(userInput.nextInt());

        ArrayShow(fullTestScore, testScore, name, title);


    }

    public static void AssignProcess(ArrayList<Integer> fullScore, ArrayList<Integer> score, ArrayList<String> name, int totalAssign)
    {
        Scanner userInput = new Scanner(System.in);
        for(int counter = 1; counter <= totalAssign; counter++)
        {
            System.out.println();
            System.out.print("Enter the name for assignment number " + (counter) + "'s name: ");
            String assignName = userInput.next();

            if (assignName.length() > 35)
            {
                String cut = assignName.substring(0, 35);
            }
            else if (assignName.length() < 35)
            {
                while (assignName.length() < 35) {
                    assignName = assignName + " ";
                }
            }
            name.add(assignName);
            System.out.print("Enter the maximum score for the assignment: ");
            fullScore.add(userInput.nextInt());
            System.out.print("Enter the score the student earned: ");
            score.add(userInput.nextInt());
        }




    }

    public static void AssignConfirm(ArrayList<Integer> fullScore, ArrayList<Integer> score, ArrayList<String> name)
    {
        String title = "Assignments";
        boolean test = true;
        Scanner userInput = new Scanner(System.in);
        while(test)
        {
            ArrayShow(fullScore, score, name, title);
            System.out.print("Are these assignments correct? [Y/N]: ");
            String response = userInput.next();
            response = response.toLowerCase();
            if (response.contains("y"))
            {
                test = false;
            }
            else if (response.contains("n"))
            {
                System.out.print("Select the assignment number to change: ");
                int assignChange = userInput.nextInt();
                if (assignChange - 1 < name.size())
                {
                    System.out.println("Select what would you like to change?");
                    System.out.println("1. Name");
                    System.out.println("2. Full Score");
                    System.out.println("3. Points given");
                    System.out.println("4. Delete assignment");
                    System.out.println("5. Add a new assignment to the table");
                    int inputTwo = userInput.nextInt();
                    userInput.nextLine();

                    switch (inputTwo)
                    {
                        case 1:
                            System.out.println("Enter a new name: ");
                            String newName = userInput.nextLine();
                            if (newName.length() > 35)
                            {
                                String cut = newName.substring(0, 35);
                            }
                            if (newName.length() < 35)
                            {
                                while (newName.length() < 35) {
                                    newName = newName + " ";
                                }
                            }
                            name.set(assignChange - 1, newName);

                            break;
                        case 2:
                            System.out.println("Enter a new full score: ");
                            int newFullScore = userInput.nextInt();
                            userInput.nextLine();
                            fullScore.set(assignChange - 1, newFullScore);
                            break;
                        case 3:
                            System.out.println("Enter a new earned score: ");
                            int newScore = userInput.nextInt();
                            userInput.nextLine();
                            score.set(assignChange - 1, newScore);
                            break;
                        case 4:
                            fullScore.remove(assignChange - 1);
                            score.remove(assignChange - 1);
                            name.remove(assignChange - 1);
                            System.out.println("Deleted Successfully");
                            break;
                        case 5:
                            System.out.println();
                            System.out.print("Enter the new assignment's name: ");
                            String assignName = userInput.next();

                            if (assignName.length() > 35)
                            {
                                String cut = assignName.substring(0, 35);
                            }
                            if (assignName.length() < 35)
                            {
                                while (assignName.length() < 35) {
                                    assignName = assignName + " ";
                                }
                            }
                            name.add(assignName);
                            System.out.print("Enter the maximum score for the assignment: ");
                            fullScore.add(userInput.nextInt());
                            System.out.print("Enter the score the student earned: ");
                            score.add(userInput.nextInt());
                        default:
                            System.out.println("Error invalid option");
                    }
                }
            }
            else
            {
                System.out.println("Invalid input please enter a Y or a N.");
                System.out.println();
                System.out.println();
                System.out.println();
            }

        }
    }

    public static void ArrayShow(ArrayList<Integer> fullScore, ArrayList<Integer> score, ArrayList<String> name, String title)
    {
        int totalEarned = 0;
        int totalMax = 0;
        System.out.println();
        System.out.println(title + ":");
        System.out.println("Name                                   Points   Total  ");
        System.out.println("-------------------------------------|--------|-------|");
        for (int x = 1; x<= name.size(); x++)
        {
            System.out.println(x + ". " + name.get(x - 1) + "   " + score.get(x - 1) + "        " + fullScore.get(x - 1) );
            totalEarned = totalEarned + score.get(x - 1);
            totalMax = totalMax + fullScore.get(x - 1);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("                              Total:     " + totalEarned + "       " + totalMax);

        System.out.println("");
        System.out.println("");
    }

}

