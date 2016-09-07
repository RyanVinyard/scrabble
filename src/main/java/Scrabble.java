import java.util.ArrayList;
import java.util.List;

public class Scrabble {

  public Integer calculateScore(String letter){
    int result = 0;
    if (letter.equals("a")) {
    result = 1;
  } else if (letter.equals("d")) {
    result = 2;
  }
    return result;
  }
}
