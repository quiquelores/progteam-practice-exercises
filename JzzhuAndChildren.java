import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class JzzhuAndChildren {

	/**
	 * There are n children in Jzzhu's school. Jzzhu is going to give some candies to them. Let's number all the children from 1 to n. 
	 * The i-th child wants to get at least ai candies.

	Jzzhu asks children to line up. Initially, the i-th child stands at the i-th place of the line. 
	Then Jzzhu start distribution of the candies. He follows the algorithm:

	Give m candies to the first child of the line.
	If this child still haven't got enough candies, then the child goes to the end of the line, else the child go home.
	Repeat the first two steps while the line is not empty.
	Consider all the children in the order they go home. Jzzhu wants to know, which child will be the last in this order?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] kids = new int[n];
		Queue<Integer> q = new LinkedList<Integer>();

		for(int i = 0; i < n ; i++){
			q.add(i);
			kids[i] = sc.nextInt();
		}		
		
		int index = 0;
		int curr = -1;
		while(!q.isEmpty()){		
			curr = q.remove();
			kids[curr] = kids[curr] - m;
			if(kids[curr]>0){
				q.add(curr);
			}
		}
		System.out.println(curr+1);
	}

}
