import java.util.*;
 

/*
 * Bessie the Cow has stolen Farmer JohnÕs tractor and is running wild on the coordinate plane! She, however, is a terrible driver, and can only move according to the following rules:

Each of her movements is in the same direction as either the positive x-axis or the positive y-axis.
Her nth movement takes her 2n-1 units forward in her chosen direction. (On her first movement, n=1, so she moves 1 unit.)
Farmer JohnÕs farm is on the coordinate plane, in the shape of a rectangle with corners at (0,0), (A,0), (0,B) and (A,B). If Bessie starts at (0,0), how many points inside the farm, including the boundary, could she reach?

Input
The input begins with an integer N (1²N²100) on a line by itself, indicating the number of test cases that follow. Each of the following N lines contains two space separated integers A and B (1²A,B²108), describing the upper-right corner of Farmer JohnÕs farm.

Output
Output N lines, with the Nth line containing the number of points that Bessie could possibly reach in the Nth test case.

In the first test case of the sample, Bessie can reach the following six points: (0,0), (0,1), (1,0), (1,2), (2,1) and (3,0)

 */
public class Tractor {
 
    public static long mostPoints(long inputs, long inputs2, long x, long y, int moves) {
        if (x>inputs || y>inputs2)
            return 0;
 
        return 1 + mostPoints(inputs, inputs2, x+moves, y, moves*2) + mostPoints(inputs, inputs2, x, y+moves, moves*2);
    }
 
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
 
        long[][] inputs = new long[n][2];
        for (int i = 0; i < n; i++) {
            String[] cors = s.nextLine().split(" ");
            inputs[i][0] = Integer.parseInt(cors[0]);
            inputs[i][1] = Integer.parseInt(cors[1]);
        }
 
        for (int i = 0; i < n; i++) {
            System.out.println(mostPoints(inputs[i][0], inputs[i][1], 0, 0, 1));
        }
    }
}