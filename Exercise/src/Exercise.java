
public class Exercise {

	public static void main(String[] args) {
		
		

	}
	
	static String longest(String sen) {
		int length = 0;
		String answer="";
		
		//assuming all non letters are punctuation and removing them
		//assuming punctuation marks in a word do not split the word so "I'll" is length 3 and "pro#%$#blem" is length 7
		sen = sen.replaceAll("[^a-zA-Z ]", "");
		
		String[] words = sen.split(" ");
		for(String word:words) {
			if(length < word.length()) {
				length = word.length();
				answer = word;
			}
		}
		//returned only the longest word instead of the longest word and it's length since the length can easily be found if
		//desired and felt it was more appropriate than returning some object with the word and the length together 
		//returns empty string if sentence given is empty or contain no letters
		//returns the first of the longest words if multiple words in the sentence are the longest
		return answer;
	}

}
