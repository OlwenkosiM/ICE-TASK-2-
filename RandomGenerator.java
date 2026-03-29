import java.util.Random;

public class GameLogic {
    private int secretNumber;
    private int attempts;
    private int maxAttempts;
    private boolean guessedCorrectly;
    private Random random;

    public GameLogic() {
        random = new Random();
        maxAttempts = 6; // player gets 6 chances
        startNewGame();
    }

    // Starts or resets the game
    public void startNewGame() {
        secretNumber = random.nextInt(200) + 1; // random number between 1 and 200
        attempts = 0;
        guessedCorrectly = false;
    }

    // Processes the player's guess
    public String checkGuess(int guess) {
        attempts++;

        if (guess == secretNumber) {
            guessedCorrectly = true;
            return "Correct! You guessed the number.";
        } else if (guess < secretNumber) {
            return "Lower!";
        } else {
            return "Higher!";
        }
    }

    // Checks if the game is over
    public boolean isGameOver() {
        return guessedCorrectly || attempts >= maxAttempts;
    }

    // Checks if the player won
    public boolean hasWon() {
        return guessedCorrectly;
    }

    // Returns attempts used
    public int getAttempts() {
        return attempts;
    }

    // Returns remaining attempts
    public int getRemainingAttempts() {
        return maxAttempts - attempts;
    }

    // Returns the correct answer after losing
    public int getSecretNumber() {
        return secretNumber;
    }

    // Scoring system
    public int calculateScore() {
        if (guessedCorrectly) {
            return (maxAttempts - attempts + 1) * 20;
        } else {
            return 0;
        }
    }
}
