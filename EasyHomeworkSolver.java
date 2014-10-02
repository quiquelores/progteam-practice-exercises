import java.util.Scanner;

public class EasyHomeworkSolver {

	/**
	 * Once upon a time a child got a test consisting of multiple-choice questions as homework. A multiple-choice question consists of four choices: A, B, C and D. 
	 * Each choice has a description, and the child should find out the only one that is correct.

		Fortunately the child knows how to solve such complicated test. The child will follow the algorithm:

		If there is some choice whose description at least twice shorter than all other descriptions, or at least twice longer than all other descriptions, then the child thinks the choice is great.
		If there is exactly one great choice then the child chooses it. Otherwise the child chooses C (the child think it is the luckiest choice).
		You are given a multiple-choice questions, can you predict child's choose?

		The first line starts with "A." (without quotes), then followed the description of choice A. 
		The next three lines contains the descriptions of the other choices in the same format. 
		They are given in order: B, C, D. Please note, that the description goes after prefix "X.", so the prefix mustn't be counted in description's length.

		Each description is non-empty and consists of at most 100 characters. Each character can be either uppercase English letter or lowercase English letter, or "_".

		Print a single line with the child's choice: "A", "B", "C" or "D" (without quotes).


	 */
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		String[] choices = new String[5];
		int index = 0;
		while(sc.hasNext()){
	     choices[index] = sc.next();
	     index++;
	     if(index == 4){
	    	 computeAnswer(choices);
	     }
		}
	}
	public static void computeAnswer(String[] choices){
		int shortest = -1, secondShortest = -1;
		int longest = -1, secondLongest =-1;
		for(int i = 0; i< choices.length; i++){
			if(shortest == -1 || choices[i] != null && choices[i].length() <= choices[shortest].length() ){
				if(shortest != -1)
					secondShortest = shortest;
				shortest = i;
			}
			else if(choices[i] != null && secondShortest > -1 && choices[i].length() >= choices[secondShortest].length() ){
				secondShortest = i;
			}
			
			if(longest == -1 || choices[i] != null && choices[i].length() >= choices[longest].length() ){
				if(longest!= -1){
					secondLongest = longest;
				}
				longest = i;
			}
			else if((i > 0 && secondLongest == -1) || (choices[i] != null && choices[i].length() >= choices[secondLongest].length() )){
				secondLongest = i;
			}
		}

		if(choices[shortest] != null && choices[shortest].length() -2  <= ((choices[secondShortest].length() -2)/2)){
			System.out.println(choices[shortest].charAt(0));
			return;
		}
		if(choices[longest] != null && choices[longest].length() -2  >= ((choices[secondLongest].length() -2)*2)){
			System.out.println(choices[longest].charAt(0));
			return;
		}
		System.out.println("C");
		return;
		
	}
}