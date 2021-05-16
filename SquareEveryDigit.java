package others;

import java.util.Scanner;

public class SquareEveryDigit {

//	 public static int squareDigits(int n) 
//	 {
//		int remainder = 0, remainder2 = 0;
//	    int result = 0, result2 = 0, square = 0;
//	    String ans = "";
//	    String s = "";
//	    
//	    while(n > 0)
//	    {
//	    	remainder = n% 10;
//	    	  s += remainder;
//	    	  n /= 10;
//	    }
//	    System.out.println(s);
//	    result = Integer.parseInt(s);
//	    
//	    while(result > 0)
//	    {
//	      remainder2 = result % 10;
//	      square = remainder2 * remainder2;
//	      ans += String.valueOf(square);
//	      
////	      System.out.println(ans);
//	      
//	      result2 = Integer.parseInt(ans);
//	      
////	      System.out.println(result2);
//	      result /= 10;
//	    }
//		return result2 * 10;
//	 }
//	 public static int squareDigitsfirstzero(int n) 
//	 {
//		int remainder = 0, remainder2 = 0;
//	    int result = 0, result2 = 0, square = 0;
//	    String ans = "";
//	    String s = "";
//	    
//	    while(n > 0)
//	    {
//	    	remainder = n% 10;
//	    	  s += remainder;
//	    	  n /= 10;
//	    }
//	    System.out.println(s);
//	    result = Integer.parseInt(s);
//	    
//	    while(result > 0)
//	    {
//	      remainder2 = result % 10;
//	      square = remainder2 * remainder2;
//	      ans += String.valueOf(square);
//	      
////	      System.out.println(ans);
//	      
//	      result2 = Integer.parseInt(ans);
//	      
////	      System.out.println(result2);
//	      result /= 10;
//	    }
//		return result2;
//	 }
//	
//	  public static void main(String[] args)
//	    {
//	    Scanner scanner = new Scanner(System.in);
//	    int a = scanner.nextInt();
//	    scanner.close();
//	    
//	    int dig = a%10;
//        System.out.print(dig == 0 ? squareDigits(a) : squareDigitsfirstzero(a));
//	    System.out.println(squareDigits(a));

//	}
	 
	
//	   public static int firstzero(int a){
//	        int dig,sum=0;
//	        while(a!=0){
//	            dig = a%10;
//	            sum = sum*10+dig;
//	            a=a/10;
//	        }
//	        return sum*10;
//	    }
//	    public static String lastzero(int a){
//	        int dig;
//	        String s="";
//	        while(a!=0){
//	            dig = a%10;
//	            s += dig;
//	            a = a / 10;
//	        }
//	        return s;
//	    }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int dig = a%10;
//         System.out.print(dig==0?lastzero(a):firstzero(a));
//     }
public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String a=sc.next();
	String a = "01230";
    char b[] = a.toCharArray();
    for(int i =0;i<b.length;i++){
        System.out.print((b[i]-'0'));
    }
	
//    Scanner sc = new Scanner(System.in);
//    String a=sc.next();
//	String a = "012340";
//    char b[] = a.toCharArray();
//    String s = "";
//    for(int i =b.length-1;i>=0;i--){
//        s+=b[i];
//    }
//    System.out.println(s);
//    
}

}
