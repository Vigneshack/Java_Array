import java.util.*;
class validpalindrome{
    public static  void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string to check");
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            Character start=str.charAt(i);
            Character end =str.charAt(j);
            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            
            }
            if(Character.toLowerCase(start) !=Character.toLowerCase(end)){
                System.out.println("Not");
            }
            i++;
            j--;
        }
        System.out.println("yes");
    }
}