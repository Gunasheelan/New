package others;

public class Swap2Strings {

	public static void main(String[] args) {
		String name = "hello hi";
		char a[] = name.toCharArray();
		Character b;
		int index = 0;
		for(int i = 0; i < a.length; i++)
		{
			b = a[i];
			if(b == 32)
			{
				index = i;
				break;
			}
		}
		
		System.out.print(name.substring(index + 1, name.length()));
		//or
//		System.out.print(name.substring(index, name.length()).replace(" ", ""));
		System.out.print(" "+name.substring(0, index));

	}

}
