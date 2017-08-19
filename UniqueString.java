import java.util.HashMap;
import java.util.Map;

class UniqueString {


public boolean isUniqueString(String input) {

  char[] inputArray = input.toCharArray();

  Map countChars = new HashMap();

  for (char currentChar : inputArray) {

    if (countChars.get(currentChar) != null) {

      int count = (int) countChars.get(currentChar);

      countChars.put(currentChar, count++);

      return false;

    } else {

      countChars.put(currentChar, 1);

    }

  }

  return true;
}

public static void main (String args[]) {

  UniqueString unique = new UniqueString();

  if (unique.isUniqueString("abca")) {
    System.out.println("String has unique characters");
  } else {
    System.out.println("String has non unique characters");
  }

}

}
