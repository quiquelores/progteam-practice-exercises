import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FlexibleSpaces {

	/**
	 * Input:
		The first line of the input contains two integers: the overall width W of the room, with 2²W²100, and the number P of intermediate partitions, such that 1²P<W. 
		Following that is a line with P integers, each designating the location L of an optional partition, such that 0<L<W. 
		Each partition is at a distinct location and the partitionsÕ locations will be listed in increasing order.

		Output:
		Your program should output a list, from smallest to largest, of each distinct width that can be achieved for a meeting space.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int size = Integer.valueOf(str[0]);
		int part = Integer.valueOf(str[1]);
		int[] locs = new int[part+2];
		locs[0] = 0;
		for(int i = 1; i<= part; i++){
			locs[i] = sc.nextInt();
		}
		locs[part+1] = size;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int a = 0; a < locs.length; a++){
			for(int b = a; b < locs.length; b++){
				al.add((locs[b]-locs[a]));
			}
		}
		Collections.sort(al);
		for(int c = 0; c < al.size(); c++){
			if(c > 0 && al.get(c) != al.get(c-1)){
				System.out.print(al.get(c));
				if(c != al.size()-1){
					System.out.print(" ");
				}
			}
			
		}
	}

}
