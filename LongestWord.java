package others;

public class LongestWord {

	public static void main(String[] args) {
		 String[] array = {"hifghj", "hello", "suer", "cat"};
		 String max = array[0];
		 for(int i = 1; i < array.length; i++)
		 {
			 if(array[1].length() > max.length())
			 {
				 max = array[i - 1];
			 }
		 }
		 System.out.println(max);

	}

}
