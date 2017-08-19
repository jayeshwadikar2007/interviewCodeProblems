
import java.util.Random;

public class MergeSort {

private final static int MAX = 20;

public void mergesort(int[] array) {
  int[] helper = new int[array.length];
  mergesort(array, helper, 0 ,array.length -1);
}


public void mergesort(int[] array, int[] helper, int low , int high) {

if (low < high) {

  int middle = (low + high) / 2;
  mergesort(array, helper, low, middle);
  mergesort(array, helper , middle + 1, high);
  merge(array, helper, low, middle, high);

}

}

public void merge(int[] array, int[] helper, int low, int middle, int high) {

  for(int i = low; i <= high; i++) {
    helper[i] = array[i];
  }

  int left = low;
  int right = middle + 1;
  int current = low;

  while (low <= middle && right <= high) {
    if(helper[left] <= helper[right]) {
      array[current] = helper[left];
      left++;
    }
    else {
      array[current] = helper[right];
      right++;
    }
    current++;
  }

  int remaining = middle - left;

  for(int i = 0; i <= remaining; i++) {
    array[current + i] = helper[left + i];
  }

}

public static void main(String args[]) {

  MergeSort merges = new MergeSort();

  int[] currentArray = new int[5];

  Random generator = new Random();
        for (int i = 0; i < currentArray.length - 1; i++) {
            currentArray[i] = generator.nextInt(MAX);
        }

  merges.mergesort(currentArray);

}

}
