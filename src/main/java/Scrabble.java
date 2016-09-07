import java.util.ArrayList;
import java.util.List;

public class Scrabble {

  public Integer calculateScore(String letter){
    int result = 0;
    if (letter.equals("a")) {
    result = 1;
  } else if (letter.equals("d")) {
    result = 2;
  } else if (letter.equals("b")) {
    result = 3;
  } else if (letter.equals("f")) {
    result = 4;
  } else if (letter.equals("k")) {
    result = 5;
  } else if (letter.equals("j")) {
    result = 8;
  } else if (letter.equals("q")) {
    result = 10;
  }
  return result;
  }
}
