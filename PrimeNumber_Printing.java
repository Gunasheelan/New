	package others;

public class PrimeNumber_Printing {
	
	// Java program to print 
	// all primes less than N 
//	class GFG 
//	{ 
//	// function check whether 
//	// a number is prime or not 
//	public boolean isPrime(int n) 
//	{ 
//	// Corner case 
//	if (n <= 1) 
//		return false; 
//
//	// Check from 2 to n-1 
//	for (int i = 2; i < n; i++) 
//		if (n % i == 0) 
//			return false; 
//
//	return true; 
//	} 
//
//	// Function to print primes 
//	void printPrime(int n) 
//	{ 
//	for (int i = 2; i <= n; i++) 
//	{ 
//		if (isPrime(i)) 
//			System.out.print(i + " "); 
//	} 
//	} 
//	}
//	// Driver Code 
//	public static void main(String[] args) 
//	{ 
//		int n = 7; 
//		printPrime(n); 
//	}


	// This code is contributed 
	// by ChitraNayal 

	
//	 public static void main (String[] args)
//	   {		
//	       int i =0;
//	       int num =0;
//	       //Empty String
//	       String  primeNumbers = "";
//
//	       for (i = 1; i <= 20; i++)         
//	       { 		  	  
//	          int counter=0; 	  
//	          for(num =i; num>=1; num--)
//		    {
//	             if(i%num==0)
//		     {
//	 		counter = counter + 1;
//		     }
//		  }
//		  if (counter ==2)
//		  {
//		     //Appended the Prime number to the String
//		     primeNumbers = primeNumbers + i + " ";
//		  }	
//	       }	
//	       System.out.println("Prime numbers from 1 to 100 are :");
//	       System.out.println(primeNumbers);
//	   }

}
