import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player kim = new Player("Kim");
        kim.play();


        System.out.println("Your score is " +kim.getScore());
        System.out.println("Number of trials :" + kim.getNumberOfPlayers());

    }
}