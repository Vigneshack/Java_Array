import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int result[] =new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            result[i]=result[i-1]+ nums[i];
    System.out.println(""+nums.length);        
   
    for(int i=0;i<nums.length;i++)
       System.out.print(result[i]+ " ");
       
       return nums;
        
    }
    public static void main(String args[]){
        Solution obj =new Solution();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] nums= new int[n];

        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        obj.runningSum(nums);
}
}