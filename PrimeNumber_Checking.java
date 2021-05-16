package others;

//import java.util.Scanner;

public class PrimeNumber_Checking {
	// this code is correct
	
	static void checkPrime(int n)
	{
		  int i,m=0,flag=0;  
		  
		  m=n/2;    
		  if(n==0||n==1)
		  {
		   System.out.println(n+" is not prime number");    
		  }
		  else
		  {
		   for(i=2;i<=m;i++)
		   {    
		    if(n%i==0)
		    {    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0) 
		   {
			   System.out.println(n+" is prime number"); 
		   }
		  }//end of else
	}
		 public static void main(String args[]){  
//		  checkPrime(1);
//		  checkPrime(3);
		  checkPrime(15);
//		  checkPrime(20);
		}  
	
	// this code doesn't printing 25, 45 is prime
	// printing the number which is divisible by 2 as not prime
	
//	public static void main(String[] args)
//	{
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		scanner.close();
//		
//		if(isPrime(input))
//		{
//			System.out.println("Prime");
//		}
//		else
//			System.out.println("Not a Prime");
//	}
//	
//	public static boolean isPrime(int input)
//	{
//		if(input <= 1)
//		{
//			return false;
//		}
//		for(int i = 2; i < input; i++)
//		{
//			if(input % 2 == 0)
//			{
//				return false;
//			}
//		}
//		return true;
//	}

}
