
import java.util.Comparator;
import java.util.Arrays;

public class AnagramComparator implements Comparator<String> {

public String sortChar(String source) {

char[] charSource = source.toCharArray();
Arrays.sort(charSource);
return new String (charSource);

}



public int compare(String source1, String source2){

return sortChar(source1).compareTo(sortChar(source2));

}


public static void main(String args[]) {

String[] stringArray = {"acre","trace","care"};

Arrays.sort(stringArray,new AnagramComparator());

for (String current : stringArray) {
   System.out.println(current);
}

}


}
