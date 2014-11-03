import java.util.Arrays;
import java.util.Scanner;


public class AddAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while( n != 0){
			int[] toBeAdded = new int[n];
			for(int i = 0; i< n; i++){
				toBeAdded[i] = sc.nextInt();
			}
			Arrays.sort(toBeAdded);
			int currCount = 0;
			for(int j = 0; j < n; j++){
				currCount += (n-j)*toBeAdded[j];
			}
			currCount -= toBeAdded[0];
			System.out.println(currCount);
			n = sc.nextInt();
			
		}
	}

}
