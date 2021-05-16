package others;

public class ReverseString_Recursion {
	
	public static String reverse(String word) {

		if(word.isEmpty()) return word;
		
		return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
		// o  + hell
		// l + hel
		// l + he
		// e + h
		// h + null
		
		// or
//		return word.substring(1) + word.charAt(0);
	}

	public static void main(String[] args) {
		String word = "hello";
		System.out.println(reverse(word));
//		if(reverse(word).equals(word)) {
//			System.out.println("palindrome");
//		}
	}

}
