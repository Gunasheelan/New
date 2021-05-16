package others;

public class Count_NoOf_Digits {

	public static void main(String[] args) {
		String word = "abc123";
		char a[] = word.toCharArray();
		Character b;
		int temp = 0;
		for(int i = 0; i < a.length; i++)
		{
			b = a[i];
			if(Character.isDigit(b))
				temp++;
		}
		System.out.println(temp);

	}

}
