import java.util.Scanner;


public class Utopian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[61];
        height[0] = 1;
        for(int a =1; a < 61; a++){
            if(a %2 == 1){
                height[a] = height[a-1]*2;
            }
            else{
                height[a] = height[a-1] +1;
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i< t; i++){
            int n = sc.nextInt();
            System.out.println(height[n]);
        }
	}

}
