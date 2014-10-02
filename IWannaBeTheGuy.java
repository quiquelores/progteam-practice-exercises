import java.util.HashSet;
import java.util.Scanner;


public class IWannaBeTheGuy {

	/**
	 * There is a game called "I Wanna Be the Guy", consisting of n levels. Little X and his friend Little Y are addicted to the game. 
	 * Each of them wants to pass the whole game.

		Little X can pass only p levels of the game. And Little Y can pass only q levels of the game. 
		You are given the indices of levels Little X can pass and the indices of levels Little Y can pass. 
		Will Little X and Little Y pass the whole game, if they cooperate each other?
		
		Input: The first line contains a single integer n (1²n²100).

		The next line contains an integer p(0²p²n) at first, then follows p distinct integers a1,a2,...,ap(1²ai²n). 
		These integers denote the indices of levels Little X can pass. The next line contains the levels Little Y can pass in the same format. 
		It's assumed that levels are numbered from 1 to n.
		Output: If they can pass all the levels, print "I become the guy.". If it's impossible, print "Oh, my keyboard!" (without the quotes).
	 */
	public static void main(String[] args) {
		
		boolean pass = true;
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine().substring(0));
		String[] x = sc.nextLine().split(" ");
		String[] y = sc.nextLine().split(" ");
		int xn = Integer.valueOf(x[0]);
		int yn = Integer.valueOf(y[0]);
		
		HashSet<Integer> hs = new HashSet<Integer>(n);
		
		for(int i = 1; i < x.length; i++){
			hs.add(Integer.valueOf(x[i]));
		}
		for(int j = 1; j < y.length; j++){

			hs.add(Integer.valueOf(y[j]));
		}
		for(int a = 1; a <= n; a++){
			if(!hs.contains(a)){
				
				pass = false;
			}
		}
		if(pass){
			System.out.println("I become the guy.");
		}
		else{
			System.out.println("Oh, my keyboard!");
		}

	}

}
