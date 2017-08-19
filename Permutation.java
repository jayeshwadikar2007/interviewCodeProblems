import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

class Permutation {

public boolean checkPermutationString(String input1, String input2) {

    char[] input1Array = input1.toCharArray();
    Map charCount1 = new HashMap();
    Map charCount2 = new HashMap();

    for (char currentChar : input1Array) {

      if (charCount1.get(currentChar) != null) {
          int currentCount = (int) charCount1.get(currentChar);
          charCount1.put(currentChar, currentCount++);
      } else {
          charCount1.put(currentChar , 1);
          System.out.println("HashMap 1" + currentChar);
      }

    }

    char[] input2Array = input2.toCharArray();

    for (char currentChar2 : input2Array) {

      if (charCount2.get(currentChar2) != null) {
          int currentCount2 = (int) charCount2.get(currentChar2);
          charCount2.put(currentChar2, currentCount2++);
      } else {
          charCount2.put(currentChar2 , 1);
          System.out.println("HashMap 2" + currentChar2);
      }

    }

    System.out.println(charCount2.toString());

    System.out.println(charCount1.toString());

    int count2 = 0;

    for (char currentChar : input1Array) {

      if (charCount2.get(currentChar) != null) {

        count2 = (int) charCount2.get(currentChar);

        System.out.println("Char" + currentChar + "Count" + count2);

        if (count2 < 1) {
          return false;
        }

      } else {
         return false;
      }




    }

    return true;
}



public static void main (String args[]) {

  Permutation perm = new Permutation();

  boolean result = perm.checkPermutationString("bat","tab");

  if(result) {
    System.out.println("Strings are permuation of each other");
  } else {
    System.out.println("Strings are not permutation");
  }

}

}
