package others;

import java.util.Scanner;

public class WordsChecking_Essay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String array[] = word.split("[ ,-.]+");
		System.out.println(array.length);
		
		scanner.close();

	}

}
