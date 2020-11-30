import java.util.Scanner;
import java.util.*;  
public class Palindrome
{
    public static boolean palindromeDescendant(int num) {
        while(num >= 10)
        {
            if(isPalindrome(num))
                return true;
            num = descendantNum(num);
        }
        return false;
    }
    public static int descendantNum(int num){
        String number = ""+num;
        String descent = "";
        int sum;
        for(int i=0;i<number.length();i+=2)
        {
            sum = Integer.parseInt(""+number.charAt(i));
            if(i+1 < number.length())
                sum += Integer.parseInt(""+number.charAt(i+1));
            descent += ""+sum;
        }
        return Integer.parseInt(descent);
    }
    public static boolean isPalindrome(int num){
        return num == reverseNum(num);
    }
    public static int reverseNum(int num){
        int reverse = 0;
        while(num > 0) {
            reverse *= 10;
            reverse += num%10;
            num /= 10;
        }
        return reverse;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        boolean flag=palindromeDescendant(s);
        System.out.println(flag);
	}
}