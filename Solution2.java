class Solution2 {
    public int solution(int[][] A) {
        // write your code in Java SE 8
        int countSaddlePoint = 0;
        for (int p = 1 ; p < A.length -1 ; p++)
            for (int q =1 ; q < A.length - 1; q ++)
             {

                System.out.println("P: " + p);
                System.out.println("Q: " + q);

                 if (((A[p][q-1] > A[p][q]) && (A[p][q] < A[p][q+1])
                 && (A[p-1][q] < A[p][q]) && (A[p][q] > A[p+1][q]))
                 || ((A[p][q-1] < A[p][q]) && (A[p][q] > A[p][q+1])
                 && (A[p-1][q] > A[p][q]) && (A[p][q] < A[p+1][q]))
                 )
                 {
                    System.out.println("Entering Here for " + p);
                    System.out.println("Entering Here for " + q);
                     ++countSaddlePoint;

                 }

             }

             return countSaddlePoint;
    }


    public static void main (String args[]) {


      int [][] myArray = {{0, 1, 9, 3}, {7,5,8,3}, {9, 2, 9, 4}, {4,6,7,1}};;
      Solution2 soln = new Solution2();


      int  output = soln.solution(myArray);

      System.out.println(output);

    }
}
