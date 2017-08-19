import java.util.Random;

class Solution1 {

    public int solution(int[] A) {
        int n = A.length;
        int result = 0;
        // n = 6
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        System.out.println("Result" + result);
        int r = 0;

        int count = 0;
        for (int i = 0; i < n; i++) {

            System.out.println("Current i value" + i);
            if (i > 0) {
                if (A[i - 1] != A[i]) {
                  count = count + 1;
                  System.out.println("Incremt count Log 1" + count);
                }

                else
                {
                    count = count - 1;
                    System.out.println("Decremt count Log 2" + count);
                }
            }
            else {
                if (A[i + 1] != A[i]) {
                  count = count + 1;
                  System.out.println("Incremt count Log 3" + count);
                }

                else
                {
                  count = count - 1;
                  System.out.println("Decremt count Log 4" + count);
                }

            }
            r = Math.max(r, count);
          //  System.out.println("Incremt count Log 5" + r);
            System.out.println("Printing r value" + r);

        }

        return result + r;
    }


    public static void main (String args[]) {

      Solution1 soln = new Solution1();
      int[] currentArray = {1,0,1};

      int output = 0;

      output = soln.solution(currentArray);

      System.out.println(output);


    }
}
