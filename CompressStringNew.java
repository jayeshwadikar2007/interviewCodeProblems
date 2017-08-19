import java.util.HashMap;

public class CompressStringNew {

public String compressString(char[] sourceString) {

char currentChar = sourceString[0];
HashMap currentCharCount = new HashMap();
int count = 1;
StringBuffer modString = new StringBuffer();
modString.append(currentChar);

for (int i = 0, j=0 ; i < sourceString.length -1; i++ )
{


currentChar = sourceString[j];

if(currentChar == sourceString[i+1]) {
modString.append(sourceString[i+1]);
count++;
}

else{

modString.append(count);
count = 1;
j = i+1;

}


}

modString.append(count);
System.out.println(modString.toString());

return modString.toString();

}

public static void main(String args[])
{
	char[] sourceStr = {'a','a','b'};
	CompressStringNew cs = new CompressStringNew();
	cs.compressString(sourceStr);

}
}
