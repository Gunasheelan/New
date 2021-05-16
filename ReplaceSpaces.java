package others;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String name = "Hello hi";
		char a[] = name.toCharArray();
		Character b;
		char c = '@';
		for(int i = 0; i < a.length; i++)
		{
			b = a[i];
			if(b == 32)
			{
				a[i] = c;
			}
			System.out.print(a[i]);
		}
//		System.out.print(name);
//		for(int i = 0; i < a.length; i++)
//		{
//			System.out.print(a[i]);
//		}

	}

}
