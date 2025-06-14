package Strings;

public class PrintEvenLenthWordsInString {
	
	public static void main(String[] args) {
		PrintEvenLenthWordsInString.printWords("my name is ramesh amale");
	}
	
	public static void printWords(String s) {
		for (String w : s.split(" ")) {
			if(w.length()%2==0) {
				System.out.println(w);
			}
		}
	}

}
