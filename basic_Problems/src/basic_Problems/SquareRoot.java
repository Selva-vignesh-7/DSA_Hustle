package basic_Problems;

import java.util.Scanner;

public class SquareRoot {
	
	public void findSqrt(int m) {
		/*
		if(n==2 || n==1) System.out.println(n);
		for(int i=1; i*i <= n; i++) {
			if(i*i == n) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("enter a perfect square number");
		*/
		int n = m;
		double ans = 1;
		double x = 0.5;
		while(x>0) {
			if(x%2==1) {
				x = x-1;
				ans = ans * n;
			}
			else {
				x = x/2;
				n = n * n;
			}
		}
		System.out.println(ans);
		
		System.out.println(Math.pow(m, 0.5));
		System.out.println(Math.sqrt(m));
	}
	
	
	
	
	
	public static void main(String[] args) {
		SquareRoot ob = new SquareRoot();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ob.findSqrt(n);
		s.close();
		
	}

}
