package others;

public class Palindrome {

	public static void main(String[] args) {
		String name = "madam";
		String reverse = "";
		
//		for(int i = name.length() - 1; i >= 0; i--)
//		{
//			reverse = reverse + name.charAt(i);
//		}
//		System.out.println(reverse);
		
		// using charArray
		char c[] = name.toCharArray();
		for(int i = name.length() - 1; i >= 0; i--)
		{
			reverse = reverse + c[i];
		}
		System.out.println(reverse);
		
		// using StringBuffer // it is not working for checking for palindrome
//		StringBuffer sb = new StringBuffer(name);
//		System.out.println(sb.reverse());
		
		//checking palindrome or not
		if(name.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
