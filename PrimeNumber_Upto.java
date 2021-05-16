package others;

public class PrimeNumber_Upto {

	public static void main(String[] args) {
		int a = 10;
		for(int i = 2; i <= a; i++)
		{
			int temp = 0;
			for(int j = 2; j <= i; j++)
			{
			   if(i % j == 0)
				  temp++;
			}
			if(temp == 1)
				System.out.println(i);
		}

	}

}
