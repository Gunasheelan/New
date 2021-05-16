package others;

public class SwapCase {

	public static void main(String[] args) {
		String word = "heLLo GuNa";
		char a[] = word.toCharArray();
		Character b;
		for(int i = 0; i < a.length; i++)
		{
			b = a[i];
			if(Character.isUpperCase(b)) // or b.isUpperCase(b)
			{
				System.out.print(Character.toLowerCase(b));
			}
			else
			{
				System.out.print(Character.toUpperCase(b));
			}
//			System.out.print(b);
		}
		
	}

}
