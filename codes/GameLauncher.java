class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            } // end if/else
        } // end loop
    } // end method
} // end class

class Player {
    int number = 0; // where the guess goes

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}




//Output is ->
//     %java GameLauncher 
    // I’m thinking of a number between 0 and 9...
    // Number to guess is 7 
    // I’m guessing 1 
    // I’m guessing 9 
    // I’m guessing 9
    // Player one guessed 1
    // Player two guessed 9
    // Player three guessed 9
    // Players will have to try again.
    // Number to guess is 7 
    // I’m guessing 3 
    // I’m guessing 0 
    // I’m guessing 9
    // Player one guessed 3
    // Player two guessed 0
    // Player three guessed 9
    // Players will have to try again.
    // Number to guess is 7 
    // I’m guessing 7 
    // I’m guessing 5 
    // I’m guessing 0
    // Player one guessed 7
    // Player two guessed 5
    // Player three guessed 0
    // We have a winner!
    // Player one got it right?true
    // Player two got it right?false
    // Player three got it right?false
    // Game is over.