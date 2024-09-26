import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String play1 = "";
        String play2 = "";

        System.out.print("Choose your move player 1 [RPS]: ");
        play1 = in.nextLine();

        System.out.print("Choose your move player 2 [RPS]: ");
        play2 = in.nextLine();

                    if (play1.equalsIgnoreCase("R")) {
                        if (play2.equalsIgnoreCase("R")) {
                            System.out.println("Rock vs Rock, It's a tie! ");
                        } else if (play2.equalsIgnoreCase("P")) {
                            System.out.println("Paper covers Rock, Player 2 wins!");
                        } else {
                            System.out.println("Rock breaks Scissors, Player 1 wins!");
                        }
                    }

                    if (play1.equalsIgnoreCase("P")) {
                        if (play2.equalsIgnoreCase("R")) {
                            System.out.println("Paper covers Rock, Player 1 wins! ");
                        } else if (play2.equalsIgnoreCase("P")) {
                            System.out.println("Paper vs Paper, It's a tie! ");
                        } else {
                            System.out.println("Scissors cuts Paper, Player 2 wins!");
                        }
                    }

                    if (play1.equalsIgnoreCase("S")) {
                        if (play2.equalsIgnoreCase("R")) {
                            System.out.println("Rock breaks Scissors, Player 2 wins! ");
                        } else if (play2.equalsIgnoreCase("P")) {
                            System.out.println("Scissors cuts Paper, Player 1 wins! ");
                        } else {
                            System.out.println("Scissors vs Scissors, It's a tie! ");
                        }

                    }


    }
}