import java.util.*;

public class roman_integer {
    public static int translate(char c){
        switch(c){
            case'I':
            return 1;
            case'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
        }
    }
    public static int romanToInt(String s){
        int sum=0;
        int curr = translate(s.charAt(0));

        for(int i=1;i<s.length();i++){
            int next =translate(s.charAt(i));

        if(curr<next)
        sum-=curr;
        else
        sum+=curr;
        curr = next;

        
        }
        sum+=curr;
        return sum;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman values");
        String rom = sc.nextLine();
        int x=romanToInt(rom);
        System.out.println(x);
    }
}
