package college;

public class LeapYear {
	public static void main(String[] args)
	{
//	    int year = 2501;
//	    
//	    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//	    {
//	    	System.out.println("Leap year");
//	    }
//	    else
//	    	System.out.println("not");
		
		// sir method
		
		int year = 300;
		if(year % 4 == 0)
		{
			if(year % 100 == 0) // checking century year
			{
				if(year % 400 == 0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
			else
			{
				System.out.println("Leap Year");
			}
				
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
