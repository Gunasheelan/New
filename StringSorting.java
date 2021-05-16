package others;

public class StringSorting {

	public static void main(String[] args) {
		String name = "hello da";
		char c[] = name.toCharArray();
		int i, j =0 ;
		
//		for(int a : c) // before sorting
//		{
//			System.out.println(a);
//		}
		int count = 0;
		for( i = 0; i < c.length; i++)
		{
			for(j = 1; j < c.length; j++)
			{
				if(c[j - 1] > c[j])
				{
					char temp = c[j - 1];
					c[j - 1] = c[j];
					c[j] = temp;
					count++; // counting how many times swapped
				}
			}
		}
		System.out.println(count);
		System.out.println(c);
		System.out.println(c[4]);

	}

}
