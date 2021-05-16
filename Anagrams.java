package others;

import java.util.Arrays;

public class Anagrams {
	
	static void isAnagram(String str1, String str2)
	{
		String s1 = str1.replace(" ", "");
		String s2 = str2.replace(" ", "");
		
		boolean status = true;	
			
		if(s1.length() != s2.length())	
		{
			 status = false; // or return;
		}
		else
		{
			// changing to lowercase and seperating each string to char
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			
			status = Arrays.equals(ArrayS1, ArrayS2);
			
		}
			
			if(status)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not a Anagram");
			}
		}
	public static void main(String[] args)
	{
		isAnagram("keep", "epek");
		isAnagram("solo", "lolo");
	}

	
//	public static void main(String[] args)
//	{
//		isAnagram("keep", "leek");
//	}
//	
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//        
//        String s1 = a.replace(" ", "");
//        String s2 = b.replace(" ", "");
//        
//        if(s1.length() != s2.length())
//        {
//            return false;
//        }
//        else
//        {
//            s1 = s1.toLowerCase();
//            s2 = s2.toLowerCase();
//            int [] charLength = new int[26];
//            
//            for(int i = 0; i < s1.length(); i++)
//            {
//                char current_char = s1.charAt(i);
//                int index = current_char - 'a';
//                charLength[index]++;
//            }
//            
//            for(int i = 0; i < s2.length(); i++)
//            {
//                char current_char = s2.charAt(i);
//                int index = current_char - 'a';
//                charLength[index]--;
//            }
//            
//            for(int i = 0; i < 26; i++)
//            {
//                if(charLength[i] != 0)
//                {
//                    return false;
//                }
//            }
//            
//            return true;
//        }
//    }
//
//    public static void main(String[] args) {
//    
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//   }

}
