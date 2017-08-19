import java.util.Map;
import java.util.HashMap;

public class PalindromePerm {

public boolean checkPalindromPerm(String input) {

  input = input.toLowerCase();

  Map<Character,Integer> countMap = new HashMap<>();

  int countOdd = 0;

  char [] inputArray = input.toCharArray();

  for (char currentChar : inputArray) {

    if (currentChar != ' ') {

      if (countMap.get(currentChar) != null) {

        int count = (int) countMap.get(currentChar);
        countMap.put(currentChar, ++count);
      }
      else {
        countMap.put(currentChar, 1);
      }

    }

  }

  System.out.println(countMap.toString());

  for (Character key : countMap.keySet()) {
    int value = countMap.get(key);

    if (value % 2 != 0) {
      countOdd++;
    }

  }

  if (countOdd > 1) {
    return false;
  }

  return true;
}

public static void main(String args[]) {

  PalindromePerm pp = new PalindromePerm();

  boolean result = pp.checkPalindromPerm("Tact Coab");

  if (result) {
    System.out.println(" String is a perm palindrome");
  } else {
    System.out.println(" String is not a perm palindrome");
  }

}

}
