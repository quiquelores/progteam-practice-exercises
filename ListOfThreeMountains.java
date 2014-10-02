import java.util.Arrays;
import java.util.Scanner;


public class ListOfThreeMountains {

	/**
	 * There is a data which provides heights (in meter) of mountains. The data is only for ten mountains.

		Write a program which prints heights of the top three mountains in descending order.

		Input

		height of mountain 1 (integer)
		height of mountain 2 (integer)
		height of mountain 3 (integer)
 		.
 		.
 		.
		height of mountain 10 (integer)
		Output

		height of the 1st mountain
		height of the 2nd mountain
		height of the 3rd mountain
		Sample Input
	
		1819
		2003
		876
		2840
		1723
		1673
		3776
		2848
		1592
		922
		Output for the Sample Input

		3776
		2848
		2840
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] mountains = new int[10];
		for(int i = 0; i < 10; i++){
			mountains[i] = sc.nextInt();
		}
		Arrays.sort(mountains);
		System.out.println(mountains[9]);
		System.out.println(mountains[8]);
		System.out.println(mountains[7]);

		
	}

}
