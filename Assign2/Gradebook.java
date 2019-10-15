import java.util.*;
public class Gradebook {
    public static int finalMax;
    public static int finalEarned;
    public static int midtermMax;
    public static int midtermEarned;
    public static double midtermCurve;
    public static double finalCurve;
    public static int scoreMidterm;
    public static int scoreFinal;

    public static void main(String[] args) {
        String studName;
        int assignCount;

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

        testProcess();

        System.out.println("Grades for " + studName);
        DisplayAssign(assignFullPoints, assignScore, assignName);
        System.out.println();
        System.out.println();
        DisplayTests();
        System.out.println();
        System.out.println();
        DisplayGrades(assignFullPoints, assignScore);
    }

    public static void testConfirm()
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            DisplayTests();
            System.out.print("Are these values correct? [Y/N]: ");
            String response = input.next();
            response = response.toLowerCase();

            if (response.contains("n")) {
                testProcess();
            }
            else if (response.contains("y")) {
                break;
            }
            else {
                System.out.println("Error invalid response");
            }
        }
    }

    public static void testProcess()
    {
        boolean test = true;
        String title ="Tests";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the total amount of possible points for the midterm exam: " );
        midtermMax = userInput.nextInt();
        System.out.println("Enter the amount of points earned on the midterm by the student: ");
        midtermEarned = userInput.nextInt();
        do
        {
            System.out.println("Enter the amount of curve applied to the midterm (Enter 1 for no curve)");
            midtermCurve = userInput.nextDouble();
            if (midtermCurve < 1)
            {
                System.out.println("Error cannot input a curve factor less than 1");
            }
            else
            {
                test = false;
            }
        } while(test);
        test = true;
        System.out.println("Enter the total amount of possible points for the final exam: " );
        finalMax = userInput.nextInt();
        System.out.println("Enter the amount of points earned on the final by the student: ");
        finalEarned = userInput.nextInt();
        do
        {
            System.out.println("Enter the amount of curve applied to the final (Enter 1 for no curve)");
            finalCurve = userInput.nextDouble();
            if (finalCurve < 1)
            {
                System.out.println("Error cannot input a curve factor less than 1");
            }
            else
            {
                test = false;
            }
        } while(test);
        test = true;
        testConfirm();
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
                while (assignName.length() < 35)
                {
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
        boolean test = true;
        Scanner userInput = new Scanner(System.in);
        while(test)
        {
            DisplayAssign(fullScore, score, name);
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
    public static char gradeCalculator(int score, int max)
    {
        double percentage = ((double)score / max) * 100;

        int grade = (int) percentage;
        if (grade >= 90)
        {
            return 'A';
        }
        else if (grade >= 80)
        {
            return 'B';
        }
        else if (grade >= 70)
        {
            return 'C';
        }
        else if (grade >= 60)
        {
            return 'D';
        }
        else if (grade < 60)
        {
            return 'F';
        }
        else
        {
            //error in calculation if returns E
            return 'E';
        }
    }

    public static void DisplayGrades(ArrayList<Integer> fullScore, ArrayList<Integer> score)
    {
        char assignLetter;
        char midtermLetter;
        char finalLetter;
        //calculate assignments
        int assignmentFullTotal = 0;
        int assignmentTotal = 0;

        for (int x = 0; x < fullScore.size(); x++)
        {
            assignmentFullTotal = assignmentFullTotal + fullScore.get(x);
        }
        for (int x = 0; x < score.size(); x++)
        {
            assignmentTotal = assignmentTotal + score.get(x);
        }
        //calculate grades
        assignLetter = gradeCalculator(assignmentTotal, assignmentFullTotal);
        midtermLetter = gradeCalculator(scoreMidterm, midtermMax);
        finalLetter = gradeCalculator(scoreFinal, finalMax);

        //building strings
        String midterm = scoreMidterm + "/" + midtermMax;
        if (midterm.length() < 10)
        {
            do {
                midterm = midterm + " ";
            } while (midterm.length() < 10);
        }
        else
        {
            midterm = midterm + "   ";
        }

        String finalString = scoreFinal + "/" + finalMax;
        if (finalString.length() < 10)
        {
            do {
                finalString = finalString + " ";
            } while (finalString.length() < 10);
        }
        else
        {
            finalString = finalString + "   ";
        }

        String assignFull = assignmentTotal + "/" + assignmentFullTotal;
        if (assignFull.length() < 10)
        {
            do {
                assignFull = assignFull + " ";
            } while (assignFull.length() < 10);
        }
        else
        {
            assignFull = assignFull + "   ";
        }

        System.out.println("Finals Grades:");
        System.out.println("Name                                   Points       Grade  ");
        System.out.println("-------------------------------------|------------|-------|");
        System.out.println("Assignments                              " + assignFull + "    " + assignLetter);
        System.out.println("Midterm                                  " + midterm + "    " + midtermLetter);
        System.out.println("Final                                    " + finalString + "    " + finalLetter);
    }

    public static void DisplayTests()
    {
        String midterm = null;
        String finalTest = null;
        scoreMidterm = (int) Math.round(midtermEarned * midtermCurve);
        scoreFinal = (int) Math.round(finalEarned * finalCurve);
        if (midtermCurve == 1)
        {
            midterm = "   No curve";
        }
        else if (midtermCurve != 1)
        {
            midterm = "      " + midtermCurve;
        }
        if (finalCurve == 1)
        {
            finalTest = "   No curve";
        }
        else if (finalCurve != 1)
        {
            finalTest = "      " + finalCurve;
        }


        System.out.println();
        System.out.println("Tests:");
        System.out.println("Name                                   Points   Total   Curve    Final");
        System.out.println("                                       Earned           Factor   Score");
        System.out.println("-------------------------------------|--------|-------|--------|--------");
        System.out.println("Midterm                                  " + midtermEarned + "      " + midtermMax + midterm + "     " + scoreMidterm);
        System.out.println("final                                    " + finalEarned + "      " + finalMax + finalTest + "     " + scoreFinal);
    }

    public static void DisplayAssign(ArrayList<Integer> fullScore, ArrayList<Integer> score, ArrayList<String> name)
    {
        int totalEarned = 0;
        int totalMax = 0;
        System.out.println();
        System.out.println("Assignments:");
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

