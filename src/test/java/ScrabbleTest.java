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
}

//I was just about to test and make sure that third test up there fails (navigate to desktop/scrabble and run gradle test) and then code in Scrabble.java for it. It'll just add on to the if loop for now. Eventually use a for loop probably with charAt() to push in this letter values.
