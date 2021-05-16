package others;

// import java.util.Scanner;

public class SubString_Comparisions_HackerRank {

//		public static String getSmallestLargest(String s, int k)
//		{
//			String Current_SubString = s.substring(0, k);
//			String Largest = Current_SubString;
//			String Smallest = Current_SubString;
//			
////			The java string compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.
////
////			It compares strings on the basis of Unicode(ASCII) value of each character in the strings.
//			
//			for(int i = 1; i <= s.length() - k; i++)
//			{
//				Current_SubString = s.substring(i, i + k);
//				
//				if(Current_SubString.compareTo(Largest) > 0)
//				{
//					Largest = Current_SubString;
//				}
//				if(Current_SubString.compareTo(Smallest) < 0)
//				{
//					Smallest = Current_SubString;
//				}
//			}
//			return Smallest+ "\n"+ Largest;
//		}
//	public static void main(String[] args)
//	{
//		//Scanner scanner = new Scanner(System.in);
//		String s = "welcometojava";
//		int k = 3;
//		
//		//scanner.close();
//		System.out.println(getSmallestLargest(s, k));
//	} 
	
	// For printing 3 each characters
	public static String print(String s, int k)
	{
		String Current_SubString = s.substring(0, k);
		for(int i = 1; i <= s.length() - k; i++)
		{
			System.out.println(Current_SubString);
			Current_SubString = s.substring(i, i + k);
		}
		
		return Current_SubString;
	}	 
		public static void main(String[] args)
		{
			//Scanner scanner = new Scanner(System.in);
			String s = "welcometojava";
			int k = 3; // how many characters to print
			
			//scanner.close();
			System.out.println(print(s, k));
		}
}
