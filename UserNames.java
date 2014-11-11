import java.util.HashSet;
import java.util.Scanner;


public class UserNames {

	/**
	 * https://icpcarchive.ecs.baylor.edu/external/57/5739.pdf
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = sc.nextInt();
		int caseNum = 1;
		while(n!=0){
			String waste = sc.nextLine();
			System.out.println("Case "+ caseNum);
			caseNum++;
			String[] names = new String[n];
			for(int i =0 ; i < n; i++){
				names[i] = sc.nextLine().toLowerCase();
			}
			HashSet<String> hs = new HashSet<String>();
			for(int j = 0; j < n; j++){
				String[] current = names[j].split(" ");
				String username = "";
				int k =0;
				char firstL = current[0].charAt(k);
				while((firstL == '\'' || firstL == '-') && k < current[0].length()){
					firstL =  current[0].charAt(++k);
				}
				username = username + firstL;
				int index = 0;
				while(index < current[current.length -1].length() && username.length() < max){
					char nextChar = current[current.length -1].charAt(index);
					while((nextChar == '\'' || nextChar == '-') && index + 1 < current[current.length-1].length()){
						nextChar = current[current.length-1].charAt(++index);
					}
					if(nextChar !='\'' && nextChar != '-'){
						username = username + nextChar;
					}
					index++;
				}
				int toDelete = 0;
				int toAdd = 1;
				while(hs.contains(username)){
					if(username.length() ==max){
						toDelete = 1;
					}
					if((toAdd == 10 && username.length() == max) || toAdd >= 11){
						toDelete = 2;
					}		
					if(username.length() == max || toDelete != 0){
						username = username.substring(0, username.length()-toDelete);
					}
					username = username + Integer.toString(toAdd);
					toDelete = 1;
					toAdd++;
				}
				hs.add(username);
				System.out.println(username);
			}
			n = sc.nextInt();
			max = sc.nextInt();
			
		}
	}

}
