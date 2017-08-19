public class CheckString {


public boolean checkStrings(char[] source1, char[] source2) {

int diffCount = 0;

if (source1 != null && source2 != null) {

for(int i =0, j=0; i < source1.length && j < source2.length ; i++,j++) {

	if (source1[i] != source2[j]){
		diffCount++;
	}

	i++;
	j++;
	
	if(diffCount > 1)
	{
		return false;
	}


}

}

return true;

}


public static void main (String args[]) {

char[] source1 = {'p','a','l','e'};
char[] source2 = {'b','a','k','e'};


CheckString checkString = new CheckString();
boolean result = checkString.checkStrings(source1,source2);

System.out.println(result);

}

}


