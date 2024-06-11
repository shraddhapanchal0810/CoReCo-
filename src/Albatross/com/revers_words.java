package Albatross.com;

public class revers_words {

	public static void main(String[] args) {
		
		 String str = "Hello World";
	        String[] words = str.split(" ");
	        StringBuilder reversedString = new StringBuilder();
	        
	        for (int i = 0; i < words.length; i++) {
	            StringBuilder reversedWord = new StringBuilder(words[i]);
	            reversedWord.reverse();
	            reversedString.append(reversedWord);
	            if (i < words.length - 1) {
	                reversedString.append(" ");
	            }
	        }
	        
	        System.out.println(reversedString.toString());
	        }
}
