public class CompressString {

public String compressString(char[] origString) {

StringBuffer modifiedString = new StringBuffer();
int countCurrentChar = 0;

if (origString != null)

{

modifiedString.append(char[0]);

for (int i = 0; i < origString.length; i++)

{

char currentChar = origString[i];

if (currentChar = origString[i+1]) {

countCurrentChar++;
modifiedString.append(char[j]);
j++;
}
else{
modifiedString.append();
j++;
i = j;
}

}


}


}
