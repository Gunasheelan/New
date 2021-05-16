package others;

public class Recursion_RevString {
	
	String result = "";

	public static void main(String[] args) {
		
		Recursion_RevString rs = new Recursion_RevString();
		String word = "hello";
		int i = word.length();
		
		String result = rs.reverse(word, i);
		System.out.println(result);

	}
	String reverse(String word, int i)
	{
		result = result + word.charAt(i - 1);
		i--;
		
		if(i > 0)
		{
			reverse(word, i);
		}
		return result;
	}

}
