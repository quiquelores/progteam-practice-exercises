import java.util.Scanner;


public class PostcardsAndPhotos {

	/**
	 * Polycarpus has postcards and photos hung in a row on the wall. He decided to put them away to the closet and hang on the wall a famous painter's picture. 
	 * Polycarpus does it like that: he goes from the left to the right and removes the objects consecutively. 
	 * As Polycarpus doesn't want any mix-ups to happen, he will not carry in his hands objects of two different types. 
	 * In other words, Polycarpus can't carry both postcards and photos simultaneously. 
	 * Sometimes he goes to the closet and puts the objects there, thus leaving his hands free. 
	 * Polycarpus must put all the postcards and photos to the closet. 
	 * He cannot skip objects. What minimum number of times he should visit the closet if he cannot carry more than 5 items?
	 * 
	 * The only line of the input data contains a non-empty string consisting of letters "C" and "P" whose length does not exceed 100 characters. 
	 * If the i-th character in the string is the letter "C", that means that the i-th object (the numbering goes from the left to the right) on Polycarpus' 
	 * wall is a postcard. And if the i-th character is the letter "P", than the i-th object on the wall is a photo.
	 * 
	 * Print the only number Ñ the minimum number of times Polycarpus has to visit the closet.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0;
		int items = 0;
		char lastChar = '\0';
		for(int i = 0; i < str.length(); i++){
			if(items == 5){
				lastChar = '\0';
				items = 0;
			}
			if(str.charAt(i) == lastChar){
				items++;
			}
			else{
				items = 1;
				count++;
				lastChar = str.charAt(i);
			}
		}
		System.out.println(count);
	}

}
