package others;
import java.util.Scanner;

public class IsOgram {
	
	    public static boolean isIsogram(String str) {
	      
	      char array[] = str.toLowerCase().toCharArray();
	      boolean status = true;
	      for(int i = 0; i < array.length; i++)
	        {
	        for(int j = i + 1; j < array.length; j++)
	         {
	          if(array[i] == array[j])
	          {
	            status = false;
	            break;
	          }
	        } 
	        
	      }
	      	return status;
	    } 
	  public static void main(String[] args)
	    {
	    Scanner scanner = new Scanner(System.in);
	    String word = scanner.nextLine();
	    scanner.close();
	    
	    System.out.println(isIsogram(word));
	     
	  }

}
