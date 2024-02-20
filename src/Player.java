import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {

    String username;
    int score = 10;
    static int numberOfTrials;

    Player(String username){

        this.username = username;
    }
    public void play(){

       try {
           Random num = new Random();
           int max = 20;
           int min = 10;
           int myNum = num.nextInt(max - min + 1) + min;

           Scanner guess = new Scanner(System.in);
           int guessedNum;

           do {
               System.out.println("guess the number between 10 and 20: ");
               guessedNum = guess.nextInt();

               if (guessedNum < myNum) {
                   System.out.println("Too low");
                   score--;
                   numberOfTrials++;

               } else if (guessedNum > myNum) {
                   System.out.println("too high");
                   score--;
               } else {
                   System.out.println("you won!");
                   System.out.println("Congratulations!");
                   score++;
                   numberOfTrials++;
               }
               if (score == 0) {
                   System.out.println("You lose");
                   break;
               }

           } while (guessedNum != myNum);


       }catch(Exception e){
           System.out.println(Arrays.toString(e.getStackTrace()));
       }


    }

    String getScore(){
        return this.score + " "+ this.username;
    }

    int getNumberOfPlayers(){
        return numberOfTrials;
    }
}
