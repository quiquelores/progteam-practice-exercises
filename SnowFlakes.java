import java.util.HashSet;
import java.util.Scanner;


public class SnowFlakes {

	/**
	 * Problem A: Unique Snowflakes
	Emily the entrepreneur has a cool business idea: packaging and selling snowflakes. She has devised a machine that captures snowflakes as they fall, and serializes them into a stream of snowflakes that flow, one by one, into a package. Once the package is full, it is closed and shipped to be sold.
	The marketing motto for the company is "bags of uniqueness." To live up to the motto, every snowflake in a package must be different from the others. Unfortunately, this is easier said than done, because in reality, many of the snowflakes flowing through the machine are identical. Emily would like to know the size of the largest possible package of unique snowflakes that can be created. The machine can start filling the package at any time, but once it starts, all snowflakes flowing from the machine must go into the package until the package is completed and sealed. The package can be completed and sealed before all of the snowflakes have flowed out of the machine.
	Input Specification
	The first line of input contains one integer specifying the number of test cases to follow. Each test case begins with a line containing an integer n, the number of snowflakes processed by the machine. The following n lines each contain an integer (in the range 0 to 10^9, inclusive) uniquely identifying a snowflake. Two snowflakes are identified by the same integer if and only if they are identical. The input will contain no more than one million total snowflakes.
	Sample Input
	1
	5
	1
	2
	3
	2
	1
	Output Specification
	For each test case output a line containing single integer, the maximum number of unique snowflakes that can be in a package.
	Output for Sample Input
	3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int[] results = new int[tests];
		for(int i = 0; i < tests; i++){
			int n = sc.nextInt();
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int j = 0; j < n; j++){
				hs.add(sc.nextInt());
			}
			results[i] = hs.size();
		}
		for(int a = 0; a < tests; a++){
			System.out.println(results[a]);
		}
	}
}
