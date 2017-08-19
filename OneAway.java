import java.util.HashMap;
import java.util.Map;

public class OneAway {


  public boolean checkOneAway(String input1, String input2) {

    char[] input1Array = input1.toCharArray();

    char[] input2Array = input2.toCharArray();

    int countMiss = 0;

    Map<Character, Integer> countMap = new HashMap<>();

    for (char currentChar : input1Array) {

      if (countMap.get(currentChar) != null) {

        int count = (int) countMap.get(currentChar);
        countMap.put(currentChar, ++count);

      } else {
        countMap.put(currentChar, 1);
      }
    }

    for (char currentChar : input2Array) {

      if (countMap.get(currentChar) == null) {
          countMiss++;
      }

    }

    if (countMiss > 1) {
      return false;
    }

    return true;
  }

  public static void main(String args[]) {

    OneAway ones = new OneAway();

    boolean result = ones.checkOneAway("pale","bake");

    if (result) {
      System.out.println(" True : Strings are 1 or 0 edits away");
    } else {
      System.out.println(" False : Strings are more than 1 edits away");
    }

  }

}
