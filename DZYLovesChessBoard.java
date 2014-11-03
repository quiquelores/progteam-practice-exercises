import java.util.Scanner;


public class DZYLovesChessBoard {

	/**
	 * DZY loves chessboard, and he enjoys playing with it.

	He has a chessboard of n rows and m columns. Some cells of the chessboard are bad, others are good. 
	For every good cell, DZY wants to put a chessman on it. Each chessman is either white or black. 
	After putting all chessmen, DZY wants that no two chessmen with the same color are on two adjacent cells. 
	Two cells are adjacent if and only if they share a common edge.

	You task is to find any suitable placement of chessmen on the given chessboard.


	The first line contains two space-separated integers n and m(1<=n,m<=100).

	Each of the next n lines contains a string of m characters: 
	the j-th character of the i-th string is either "." or "-". A "." means that the corresponding cell (in the i-th row and the j-th column) is good, 
	while a "-" means it is bad.

	Output must contain n lines, each line must contain a string of m characters. 
	The j-th character of the i-th string should be either "W", "B" or "-". 
	Character "W" means the chessman on the cell is white, "B" means it is black, "-" means the cell is a bad cell.

	If multiple answers exist, print any of them. It is guaranteed that at least one answer exists.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String whatever = sc.nextLine();
		char[][] board = new char[n][m];
		for(int i = 0; i < n ; i++){
			String str = sc.nextLine();
			char[] newline = str.toCharArray();
			for(int j = 0; j< str.length(); j++){
				board[i][j] = newline[j];
			}
		}

		char[][] newboard = new char[n][m];
		for(int j = 0; j<n; j++){
			for(int k = 0; k < m; k++){
				newboard[j][k] = getChar(j,k);
			}
		}
		
		
		for(int j = 0; j < n; j++){
			for(int k = 0; k < m ; k++){
				if(board[j][k] == 45){
					newboard[j][k] = '-';
				}
			}
		}
		
		for(int j = 0; j < n; j++){
			System.out.println();

			for(int k = 0; k < m ; k++){
				System.out.print(newboard[j][k]);
			}
		}
	}
	public static char getChar(int j, int k){
		if((j+k)%2 == 0){
			return 'B';
		}
		return 'W';
	}

}
