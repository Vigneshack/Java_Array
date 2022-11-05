import java.util.Scanner;

public class pivotindex {
    public int pivotIndex(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        if(temp==sum)
            return i;
        temp+=nums[i];
            
           }
         return -1;
        
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        System.out.println("Enter the array");
        
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        nums[i]= sc.nextInt();
        pivotindex obj =new pivotindex();
        int x= obj.pivotIndex(nums);
        System.out.println(x);
    }    
    
}
