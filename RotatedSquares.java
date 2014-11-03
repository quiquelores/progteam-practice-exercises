import java.util.Scanner;


public class RotatedSquares {

	/**
	 * The Problem
	Given a square of N rows and columns of uppercase letters, and another smaller square of n rows and columns of uppercase letters, we want to count the number of appearances in the big square of the small square in all the rotated forms.
	The Input
	The input will consist of a series of problems, with each problem in a series of lines. In the first line, the dimension of the two squares, N and n (with 0<n<=N), is indicated by two integer numbers separated by a space. The N lines of the first square appear in the following N lines of the input, and then the n lines of the second square appear in the following n lines. The characters in a line are one after another, without spaces. The end of the sequence of problems is indicated with a case where N=0 and n=0.
	The Output
	The solutions of the different problems appear in successive lines. For each problem the output consists of a line with four integers, which are the number of times each rotation of the small square appears in the big square. The first number corresponds to the number of appearances of the small square without rotations, the second to the appearances of the square rotated 90 degrees (clockwise), the third to the square rotated 180 degrees, and the fourth to the square rotated 270 degrees. 
	Sample Input
	4 2
	ABBA
	ABBB
	BAAA
	BABB
	AB
	BB
	6 2
	ABCDCD
	BCDCBD
	BACDDC
	DCBDCA
	DCBABD
	ABCDBA
	BC
	CD
	0 0
	Sample Output
	0 1 0 0
	1 0 1 0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0){
				return;
			}
			String garbage = sc.nextLine();
			char[][] matrix = new char[n][n];
			for(int i = 0; i < n; i++){
				String str = sc.nextLine();
				for(int j = 0; j < n; j++){
					matrix[i][j] = str.charAt(j);
				}
			}
			char[][] input = new char[s][s];
			for(int a = 0; a < s; a++){
				String str = sc.nextLine();
				for(int b = 0; b < s; b++){
					input[a][b] = str.charAt(b);
				}
			}
			char[][] rot90 = new char[s][s];
			char[][] rot180 = new char[s][s];
			char[][] rot270 = new char[s][s];

			for(int x= 0; x < s; x++){
				for(int y = 0; y < s; y++)
				{
					rot270[s-1-y][x] = rot180[s-1-x][s-1-y] = rot90[y][s-1-x] = input[x][y];
				}
			}
			int count0 = 0, count90= 0, count180 = 0, count270=0;
			for(int k = 0; k < n-s+1; k++){
				for(int l = 0; l < n-s+1; l++){
					int indexX = 0, indexY = 0;
					
					while(indexY<s && matrix[k+indexX][l+indexY] == input[indexX][indexY]){
						
						indexX++;
						if(indexX==s){
							indexY++;
							indexX=0;
						}
					}
					if(indexY==s){
						count0++;
					}
					int x90 = 0, y90 = 0;
					while(y90<s && matrix[k+x90][l+y90] == rot90[x90][y90]){
						x90++;
						if(x90==s){
							
							x90=0;
							y90++;
						}
					}
					if(y90==s){
						count90++;
					}
					int x180 = 0, y180 = 0;
					while(y180<s && matrix[k+x180][l+y180] == rot180[x180][y180]){
						x180++;
						if(x180==s){
							x180=0;
							y180++;
						}
					}
					if(y180==s){
						count180++;
					}
					int x270 = 0, y270 = 0;
					while(y270<s && matrix[k+x270][l+y270] == rot270[x270][y270]){
						x270++;
						if(x270==s){
							x270=0;
							y270++;
						}
					}
					if(y270==s){
						count270++;
					}
				}
			}
			System.out.println(count0 + " " + count90 + " " + count180 + " "+ count270);
		}
	}

}
