import java.util.Map;
import java.util.HashMap;


public class Solution {
    
    
        
    public int[] twoSum(int[] nums, int target) {
        
        int [] outputArray = new int[nums.length];
        int count = 0;
        
        
        Map<Integer,Integer> myHashMap = new HashMap<>();
        
        for (int i = 0 ; i < nums.length; i++) {
           
           myHashMap.put(nums[i],i);
            
        }
        
        for (int i = 0 ; i < nums.length; i++) {
            int searchTarget = target - nums[i];
            
            if (myHashMap.containsKey(searchTarget)) {
                outputArray[count++] = (int) myHashMap.get(searchTarget);
                outputArray[count++] = i;
                break;
            }
            
        }
        
        return outputArray;
        
    }
    
    public static void main(String args[]) {
        
        Solution s = new Solution();
        
        int[] myArray = {1,2,3,4};
        
        int[] outputArray = s.twoSum(myArray,6);
        
        for (int i : outputArray) {
            System.out.println(i);
        }
        
    }
}