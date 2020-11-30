import java.util.Scanner;
import java.util.*;  
public class HashTag
{
    
    public static void getHasTags(String str){
        //to handle all punctuation
        String[] words= str.split("[\\p{Punct}\\s]+");
        
        for (int i=1 ;i<words.length; i++) 
    { 
        String temp = words[i]; 
  
        // Insert s[j] at its correct position 
        int j = i - 1; 
        while (j >= 0 && temp.length() > words[j].length()) 
        { 
            words[j+1] = words[j]; 
            j--; 
        } 
        words[j+1] = temp; 
    } 
        
        
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<words.length;i++) {
		 if(i==3)
		    break;
         list.add("#"+words[i]);
      }
         
        System.out.println(list);
    }
    
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//enter the string
        String s=sc.nextLine();
        getHasTags(s);
        
	}
}
