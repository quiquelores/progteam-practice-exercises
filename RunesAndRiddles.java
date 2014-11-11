import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class RunesAndRiddles {

	/**
	 * https://icpcarchive.ecs.baylor.edu/external/62/6228.pdf
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gates = sc.nextInt();
//		String garbage = sc.nextLine();
		for(int i = 0; i < gates; i++){

			int rings = sc.nextInt();
			int runes = sc.nextInt();
			//garbage = sc.nextLine();

			boolean nullRing= false;
			boolean missingRing = false;
			boolean repeatedRing = false;
			boolean unsat = false;
			boolean invalid = false;
		
			ArrayList<Set> solutions = new ArrayList<Set>();
			
			for(int j = 0; j < runes; j++){
				//String[] currLine = sc.nextLine().split(" ");
				int[] currRune = new int[3];
				HashSet<Integer> runeHS = new HashSet<Integer>();

				for(int z = 0; z < 3; z++){
					int curr = sc.nextInt();
				//	int curr = Integer.valueOf(currLine[z]);
					if(curr == 0 || curr == -0){
						nullRing = true;
						invalid = true;
					}
					if((curr < -rings || curr > rings)){
						missingRing = true;
						invalid = true;
					}
					if(runeHS.contains(curr) || runeHS.contains(-curr)){
						repeatedRing = true;
						invalid = true;
					}
					currRune[z] = curr;
					runeHS.add(curr);
					if(!invalid){

						if(j==0){
							HashSet<Integer> set = new HashSet<Integer>();
							set.add(curr);
							solutions.add(set);
						}
						for(int a = 0; a < solutions.size(); a++){
							if(!solutions.get(a).contains(-curr) && !solutions.get(a).contains(curr)){
								Set<Integer> set = solutions.get(a);
								set.add(curr);
								solutions.add(set);
							}
						}
					}
				}
				int garb = sc.nextInt();

				if(!invalid){
					int b = 0;
					while(b < solutions.size()){
						if(!solutions.get(b).contains(currRune[0]) && !solutions.get(b).contains(currRune[1]) 
								&& !solutions.get(b).contains(currRune[2])){
							solutions.remove(b);
						}
						else{
							b++;
						}
					}
					if(solutions.size() == 0){
						invalid = true;
						unsat = true;
					}
				}
			}
			if(nullRing){
				System.out.println("INVALID: NULL RING");
			}
			else if(missingRing){
				System.out.println("INVALID: RING MISSING");
			}
			else if(repeatedRing){
				System.out.println("INVALID: RUNE CONTAINS A REPEATED RING");
			}
			else if(unsat){
				System.out.println("RUNES UNSATISFIABLE! TRY ANOTHER GATE!");
			}
			else{
				System.out.println("RUNES SATISFIED!");
			}
		}
	}

}
