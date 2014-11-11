import java.util.Scanner;


public class GoodVersusEvil {

	/**
	 * https://icpcarchive.ecs.baylor.edu/external/62/6224.pdf
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] goodVals = {1, 2, 3, 3, 4, 10};
		int[] evilVals = {1, 2, 2, 2, 3, 5, 11};
		for(int i = 1; i <= n; i++){
			int goodSum = 0;
			int evilSum = 0;
			for(int j = 0; j < goodVals.length; j++){
				goodSum += goodVals[j]*sc.nextInt();
			}
			for(int k = 0; k < evilVals.length; k++){
				evilSum += evilVals[k]*sc.nextInt();
			}
			if(evilSum==goodSum){
				System.out.println("Battle "+ i +": No victor on this battle field");
			}
			else if(goodSum>evilSum){
				System.out.println("Battle "+ i +": Good triumphs over Evil");
			}
			else if(evilSum>goodSum){
				System.out.println("Battle "+ i +": Evil eradicates all trace of Good");
			}
		}
	}

}
