package others;

public class RecursionAdding {
	int ans = 0;
	
	public static void main(String[] args) {
		RecursionAdding r = new RecursionAdding();
		
		int result = r.add(5);
		System.out.println(result);
		
	  }
	int add(int num)
	{
		ans = ans + num;
		num--;
		
		if(num > 0)
		{
			add(num);
		}
		return ans;
	}
	
	// or
//	int add(int num)
//	{
//		if(num > 0)
//		{
//			ans = ans + num;
//			num--;
//			add(num);
//		}
//		return ans;
//	}
	
}
