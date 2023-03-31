import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class RPS_game {
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);


        //GENERATING RANDOM IN JAVA B/W 1 TO 10
        Random rand = new Random();
        int random=0;
        while(true){
            random=rand.nextInt(11);
            if (random != 0) break;
        }



        //Asking USer for playing Set
        System.out.println("\n\n ***************************** ROCK PAPER SCISSORS GAME *****************************");
        System.out.println("Which Set do you want to play?");
        System.out.println("Press 1 for set of 3");
        System.out.println("Press 2 for set of 5");
        int ch = S.nextInt();
        int winner=0;
        int loser=0;
        int tie=0;
        switch (ch){
            case 1:
                for (int i=0;i<3;i++){
                    System.out.println("Choose your Choice and i will choose Mine😉😉😉");
                    System.out.println("Press 1 For Rock");
                    System.out.println("Press 2 For Paper");
                    System.out.println("Press 3 For Scissor");
                    int choice = S.nextInt();
                    switch (choice){
                        case 1:
                            while(true){
                                random=rand.nextInt(11);
                                if (random != 0) break;
                            }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So i won");
                                loser++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So you Won");
                                winner++;
                            }
                            break;
                        case 2:
                            while(true){
                                random=rand.nextInt(11);
                                if (random != 0) break;
                            }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So you Won");
                                winner++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So I Won");
                                loser++;
                            }
                            break;
                            case 3:
                                while(true){
                                    random=rand.nextInt(11);
                                    if (random != 0) break;
                                }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So I won");
                                loser++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So you won");
                                winner++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            break;

                    }

                   }
                if (winner==3){
                    System.out.println("\nWOW !! You have won a complete set , Congratulation.");
                }
                if (winner==2){
                    System.out.println("\nGood, You won 2 out of 3 game, Congratulation");
                }
                if (winner==1 && tie==0){
                    System.out.println("\nAlas, you have only won 1 out of 3 games, So you lose to me😢😢");
                }
                if(winner==1 && tie==1){
                    System.out.println("\nOMG!! Its a tie game");
                }
                if(tie==2){
                    System.out.println("\nOMG!! Its a tie game");
                }
                if(loser==3){
                    System.out.println("\nToo bad , you haven't won a single game");
                }

                break;
            case 2:
                for (int j=0;j<5;j++){
                    System.out.println("Choose your Choice and i will choose Mine😉😉😉");
                    System.out.println("Press 1 For Rock");
                    System.out.println("Press 2 For Paper");
                    System.out.println("Press 3 For Scissor");
                    int choice2 = S.nextInt();
                    switch (choice2)
                    {
                        case 1:
                            while(true){
                                random=rand.nextInt(11);
                                if (random != 0) break;
                            }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So i won");
                                loser++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose ROCK");
                                System.out.println("So you Won");
                                winner++;
                            }
                            break;
                        case 2:
                            while(true){
                                random=rand.nextInt(11);
                                if (random != 0) break;
                            }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So you Won");
                                winner++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose PAPER");
                                System.out.println("So I Won");
                                loser++;
                            }
                            break;
                        case 3:
                            while(true){
                                random=rand.nextInt(11);
                                if (random != 0) break;
                            }
                            if (random<=3){
                                System.out.println("I have choose ROCK");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So I won");
                                loser++;
                            }
                            else if (random<=7){
                                System.out.println("I have choose Paper");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So you won");
                                winner++;
                            }
                            else{
                                System.out.println("I have choose Scissors");
                                System.out.println("You Have choose SCISSORS");
                                System.out.println("So its a tie");
                                tie++;
                            }
                            break;
                    }
                }
                if (winner==5){
                    System.out.println("\nWOW !! You have won a complete set , Congratulation.");
                }
                if (winner==4){
                    System.out.println("\nGood, You won 4 out of 5 game, Congratulation");
                }
                if (winner==3){
                    System.out.println("\nNice, You won 3 out of 5 game, Congratulation");
                }
                if (winner==2 && tie==0){
                    System.out.println("\nAlas, you have only won 2 out of 5 games, So you lose to me😢😢");
                }
                if(winner==1 && tie==4){
                    System.out.println("\nOMG!! Its a tie game");
                }
                if(tie==3){
                    System.out.println("\nOMG!! Its a tie game");
                }
                if(loser==5){
                    System.out.println("\nToo bad , you haven't won a single game");
                }

                break;
            default:
                System.out.println("Please Please , Enter a valid choice");
                System.out.println("To play again Re-Run the code");
                break;
        }



    }
}