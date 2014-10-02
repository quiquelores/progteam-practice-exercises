import java.util.Scanner;


public class BusStopQueues {

	/**
	 * It's that time of the year when the Russians flood their countryside summer cottages (dachas) and the bus stop has a lot of people. 
	 * People rarely go to the cottages on their own, it's usually a group, so the people stand in queue by groups.
		The bus stop queue has n groups of people. The i-th group from the beginning has ai people. Every 30 minutes an empty bus arrives at the bus stop, it can carry at most m people. 
		Naturally, the people from the first group enter the bus first. 
		Then go the people from the second group and so on. Note that the order of groups in the queue never changes. 
		Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus together with other groups standing after it in the queue.
		Your task is to determine how many buses is needed to transport all n groups to the dacha countryside.
				
		Input:The first line contains two integers n and m(1<=n,m<=100). The next line contains n integers: a1,a2,...,an(1<=ai<=m).
		Output: Print a single integer Ñ the number of buses that is needed to transport all n groups to the dacha countryside.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[] str1 = sc.nextLine().split(" ");
			String[] str2 = sc.nextLine().split(" ");
			int n = Integer.valueOf(str1[0]);
			int m = Integer.valueOf(str1[1]);
			int[] group = new int[n];
			for(int i = 0; i<str2.length; i++){
				group[i] = Integer.valueOf(str2[i]);
			}
			getNumOfBuses(group, m);
			
		}
	}
	public static void getNumOfBuses(int[] groups, int m){
		int i = 0;
		int current = 0;
		int numOfBuses =1;
		while(i < groups.length){
			if(groups[i] <= (m - current)){
				current += groups[i];
			}
			else{
				numOfBuses++;
				current = groups[i];	
			}
			i++;
		}
		System.out.println(numOfBuses);
	}
	
}
