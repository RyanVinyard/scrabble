import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }

  @Test
  public void calculateScore_returnsScoreForLetter_K() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_8() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }

  @Test
  public void calculateScore_returnsScoreForWord() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 20;
    assertEquals(expected, testScrabble.calculateScore("quick"));
  }
}

//I was just about to test and make sure that third test up there fails (navigate to desktop/scrabble and run gradle test) and then code in Scrabble.java for it. It'll just add on to the if loop for now. Eventually use a for loop probably with charAt() to push in this letter values.
