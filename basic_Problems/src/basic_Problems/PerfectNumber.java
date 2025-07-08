package basic_Problems;

import java.util.Scanner;

public class PerfectNumber {
	
	public boolean findPerfect(int n) {
		int sum = 1;
		for(int i=2; i*i <= n; i++) {
			if(n%i==0) {
				sum = sum + i + (n/i);
			}
			/*else {
				sum = sum + i;
				System.out.println(sum);
			}*/
		}
		return sum==n && n!=1;
	}

	public static void main(String[] args) {
		PerfectNumber ob = new PerfectNumber();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(ob.findPerfect(n)) {
			System.out.println("Perfect number");
		}else {
			System.out.println("not a Perfect number");
		}
		s.close();
	}

}
