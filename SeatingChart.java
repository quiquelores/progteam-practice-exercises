import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SeatingChart {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n; 
		while(!(n = bf.readLine()).equals("0")){
			String[] correctOrder = bf.readLine().split(" ");
			String[] wrongOrder = bf.readLine().split(" ");
			int numOfSwitches = 0;
			int index = 0;
			while(index != correctOrder.length && !arraysEqual(correctOrder, wrongOrder, index)){
				String toFind = correctOrder[index];
				int j = index;
				while(!wrongOrder[j].equals(correctOrder[index])){
					j++;
				}
				if(index != j){
					String temp = wrongOrder[j];
					wrongOrder[j] = wrongOrder[index];
					wrongOrder[index] = wrongOrder[j];
					numOfSwitches++;
				}
				index++;
			}
			System.out.println(numOfSwitches);
		}
	}
	
	public static boolean arraysEqual(String[] arr1, String[] arr2, int s){
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i = s; i < arr1.length; i++){
			if(!(arr1[i].equals(arr2[i]))){
				return false;
			}
		}
		return true;
	}
}
