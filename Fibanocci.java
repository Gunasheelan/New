package others;

public class Fibanocci {

	public static void main(String[] args) {
		int j = 0, k = 1, l, num = 5;
		System.out.print(j+" "+k);
		for(int i = 2; i < num; i++)
		{
			l = j + k;
			System.out.print(" "+l);
			j = k;
			k = l;
		}

	}

}
