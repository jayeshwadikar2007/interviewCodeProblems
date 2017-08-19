public class ListeningSongs {


public int listen(int[] durations1,int[] durations2, int minutes, int T) {

int seconds = minutes * 60;
int sum = 0;
int countSongs = 0;

for(int i = 0, j = 0; i < durations1.length && j < durations2.length;)

{
System.out.println("T is "+T);
System.out.println("i is "+i);

if (T > i) {
sum = sum + durations1[i] + durations2[j];
countSongs = countSongs + 2;
i++;
j++;
if (sum > seconds) {

return -1;
}

}
else
{

System.out.println("Sum is "+sum);

if (sum < seconds) {

if (durations1[i] < durations2[j]) {

int resultSum = sum + durations1[i];

if (resultSum < seconds) {

sum = sum + durations1[i];
countSongs++;
i++;

}
else {
return countSongs;
}

}
else {
int resultSum2 = sum + durations2[j];

if (resultSum2 < seconds) {
sum = sum + durations2[j];
countSongs++;
j++;
}
else{
return countSongs;
}
}

}

else {

return countSongs;

}

}

}
return countSongs;

}

public static void main (String args[]) {

int[] durations1 = {100,200,300};
int[] durations2 = {400,500,600};
int minutes = 10;
int T = 1;

ListeningSongs ln = new ListeningSongs();
int countSongs = ln.listen(durations1,durations2,minutes,T);

System.out.println(countSongs);

}


}
