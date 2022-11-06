import java.util.Scanner;

public class twosum {
    
    
        public int[] twoSum(int[] nums, int target) {
            int[] ans = {0,0};
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        ans[0]=j;
                        ans[1]=i;
                    }
                        
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        System.out.println("Enter the target");
        int target= sc.nextInt();
        System.out.println("Enter the array");
        
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        nums[i]= sc.nextInt();
        twosum obj =new twosum();
        
        System.out.println("Answer: ");
        System.out.println(obj.twoSum(nums,target)[0]);
        System.out.println(obj.twoSum(nums,target)[1]);
    }    








}
