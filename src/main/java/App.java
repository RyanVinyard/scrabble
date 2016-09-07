import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a letter and I'll give you its Scrabble score, not counting any bonus tiles.");
    String word = myConsole.readLine();
    Scrabble scrabble = new Scrabble();
    Integer scrabbleResult = scrabble.calculateScore(word);
    System.out.println(scrabbleResult);
  }
}
