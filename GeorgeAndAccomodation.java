import java.util.Scanner;


public class GeorgeAndAccomodation {

	/**
	 * George has recently entered the BSUCP (Berland State University for Cool Programmers). 
	 * George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

	George and Alex want to live in the same room. The dormitory has n rooms in total. 
	At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi²qi). 
	Your task is to count how many rooms has free place for both George and Alex.
	
	Input:  The first line contains a single integer n(1²n²100) Ñ the number of rooms.
			The i-th of the next n lines contains two integers pi and qi(0²pi²qi²100) Ñ the number of people who already live in the i-th room and the room's capacity.
	Output: Print a single integer Ñ the number of rooms where George and Alex can move in.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int[] ps;
		int [] qs;
		int pindex =0;
		int qindex = 0;
		
			String str1 = sc.nextLine();
			n = Integer.valueOf(str1.substring(0));
			if(n == 0){
				System.out.println("0");
			}
			ps = new int[n];
			qs = new int[n];
			for(int j = 0; j<n; j++){
				String[] str = sc.nextLine().split(" ");
				ps[pindex] = Integer.valueOf(str[0]);
				qs[qindex] = Integer.valueOf(str[1]);
				pindex++;
				qindex++;
				if(j == (n-1)){
					getNumOfRooms(qs, ps);
				}
			}
	}
	public static void getNumOfRooms(int qs[], int ps[]){
		int numRooms = 0;
		for(int i = 0; i < qs.length; i++){
			if((ps[i]+2) <= qs[i] && qs[i] <= 100){
				numRooms++;
			}
		}
		System.out.println(numRooms);
	}
}
