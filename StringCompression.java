public class StringCompression {

public String compressString(String input) {

  StringBuilder outputString = new StringBuilder();

  StringBuilder tempString = new StringBuilder();

  char[] input1Array = input.toCharArray();

  int countChar = 0;

  Character currentChar = null;

  for (int i = 0; i < input1Array.length -1; i++) {

    currentChar = input1Array[i];
    if (input1Array[i] == input1Array[i+1]) {
      countChar++;
    }
    else {
      outputString.append(currentChar).append(countChar);
      countChar = 1;
    }
  }
  outputString.append(currentChar).append(countChar);

  if (outputString.toString().length() < input.length()) {
    return outputString.toString();
  }
  else {
    return input;
  }

}

public static void main(String args[]) {

  StringCompression strCompress = new StringCompression();

  System.out.println(strCompress.compressString("abcd"));

}

}
