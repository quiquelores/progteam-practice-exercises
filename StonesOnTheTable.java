import java.util.Scanner;

/*
	There are n stones on the table in a row, each of them can be red, green or blue. 
	Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. 
	Stones in a row are considered neighboring if there are no other stones between them.
	Input:
	The first line contains integer n(1 ≤ n ≤ 50) — the number of stones on the table.

	The next line contains string s, which represents the colors of the stones. 
	We'll consider the stones in the row numbered from 1 to n from left to right. 
	Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.
	Print a single integer — the answer to the problem.
*/
public class StonesOnTheTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strNull = sc.nextLine();
		String str = sc.nextLine();

		//int n = Integer.valueOf(str[0]);
		int count = 0;
		char curr = '\0';
		for(int i = 0; i< n; i++){
			if(curr == str.charAt(i)){
				count++;
			}
			curr = str.charAt(i);
		}
		System.out.println(count);
	}

}