import java.util.Scanner;


public class SummingDigits {

	/**
	 * For a positive integer n, let f(n) denote the sum of the digits of n when represented in base 10. It is easy to see that the sequence of numbers n, f(n), f(f(n)), f(f(f(n))), ... eventually becomes a single digit number that repeats forever. Let this single digit be denoted g(n).
	For example, consider n = 1234567892. Then:
	f(n) = 1+2+3+4+5+6+7+8+9+2 = 47
	f(f(n)) = 4+7 = 11
	f(f(f(n))) = 1+1 = 2
	Therefore, g(1234567892) = 2.
	Each line of input contains a single positive integer n at most 2,000,000,000. For each such integer, you are to output a single line containing g(n). Input is terminated by n = 0 which should not be processed.
	Sample input
	2
	11
	47
	1234567892
	0
	Output for sample input
	2
	2
	2
	2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0){
			f(n);
			n= sc.nextInt();
		}
	}
	public static void f(int n){
		if(n<10){
			System.out.println(n);
			return;
		}
		int a = 0;
		
		while(n!=0){
			a = a + (n % 10);
			n = n / 10;
		}
		f(a);
	}

}