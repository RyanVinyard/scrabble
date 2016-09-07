import java.util.ArrayList;
import java.util.List;

public class Scrabble {

  public Integer calculateScore(String word){
    int result = 0;
    for (int i = 0; i < word.length(); i++) {
    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 't' || word.charAt(i) == 'l' || word.charAt(i) == 'n') {
    result += 1;
  } else if (word.charAt(i) == 'd' || word.charAt(i) == 'g') {
    result += 2;
  } else if (word.charAt(i) == 'b' || word.charAt(i) == 'c' || word.charAt(i) == 'm' || word.charAt(i) == 'p') {
    result += 3;
  } else if (word.charAt(i) == 'f' || word.charAt(i) == 'h' || word.charAt(i) == 'v' || word.charAt(i) == 'w' || word.charAt(i) == 'y') {
    result += 4;
  } else if (word.charAt(i) == 'k') {
    result += 5;
  } else if (word.charAt(i) == 'j' || word.charAt(i) == 'x') {
    result += 8;
  } else if (word.charAt(i) == 'q' || word.charAt(i) == 'z') {
    result += 10;
  }
}
  return result;
  }
}
