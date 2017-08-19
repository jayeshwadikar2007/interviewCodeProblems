public class Solutuon {


    public int[] productExceptSelf(int[] nums) {
    
    int [] outputArray = new int[8];
    
    int outputCount = 0;
    
    int counter = 0;

    for (int i = 0; i < nums.length ; i++, outputCount++) {
        
        int result = 1;
        
        for (int j = 0 ; j < nums.length; j++ ) {
        
            if (j != outputCount) {
            
            result = result * nums[j];
            
            
            }  
        
        }
        outputArray[counter++] = result;
        
    }
        
    return  outputArray;   
        
    }
    
    public int[] productExceptSelf2(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
        
    for (int i : res) {
            System.out.println(i);
        }
        
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right;
        right *= nums[i];
    }
        
    for (int i : res) {
            System.out.println(i);
        }
        
    return res;
}
    
    public static void main(String args[]) {
    
        Solutuon s = new Solutuon();
        
        int [] myArray = {1,2,3,4};
        
        int [] outputArray = s.productExceptSelf2(myArray);
        
        for (int i : outputArray) {
            System.out.println(i);
        }
        
        
    
    }
}