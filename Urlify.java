public class Urlify {

  public String urlifyStr(String input) {

    input = input.trim();

    char[] inputArray = input.toCharArray();
    StringBuilder output = new StringBuilder();

    for (char currentChar : inputArray) {
      if (currentChar == ' ') {
        output.append("%20");
      }
      else {
        output.append(currentChar);
      }

    }

    return output.toString();

  }

  public static void main (String args[]) {

    Urlify urls = new Urlify();

    String result = urls.urlifyStr("Mr John Smith  ");

    System.out.println(result);
  }

}
