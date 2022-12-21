import java.util.*;



public class duplicate {

    public static void check(int[] nums){
            int flag =0;
            for(int j=0;j<nums.length;j++){
                for(int i=j+1;i<nums.length;i++){
                    if(nums[j]==nums[i])
                    flag=1;

                }
            }
            if(flag==1)
            System.out.println("true");
            else if(flag==0)
            System.out.println("false");
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of input");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();

        }
        check(nums);

    }
    
}
