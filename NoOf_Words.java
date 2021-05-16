package others;

public class NoOf_Words {

	public static void main(String[] args) {
		String word = "hi hello     jojkl super";
		char b[] = word.toCharArray();
		int space = 1;
		for(int i = 0; i < b.length; i++)
		{	
			if(b[i] == 32) // or if(n[i] == ' ')
			{
				space += 1;
			}
//			System.out.println((int) b[i]);
			
		}
		System.out.println(space);
		
		// crt method
		  String a[] = word.split(" +");
		    System.out.println(a.length);

	}

}
