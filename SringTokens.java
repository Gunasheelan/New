package others;

public class SringTokens {
	public static void main(String[] args)
	{
		String word = "He is a very very good boy, isn't he?";
		word = word.trim();
//		if(word.length() == 0)
//		{
//			System.out.println(0);
//			return;
//		}
		
		String array[] = word.split("[^a-zA-Z	]+");
//		String array2[] = word.split(",", 6);
		System.out.println(array.length);
		for(String s : array)
		{
			System.out.println(s);
		}
//		for(String s2 : array2)
//		{
//			System.out.println(s2);
//		}
	}

}
