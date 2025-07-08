package basic_Problems;

import java.util.Scanner;

public class PrimeNumber {
	
	@SuppressWarnings("unused")
	public String isPrime(int n) {
		if(n<=1) return "not a prime number";
		if(n==2 || n==3) return "Prime Number";
		for(int i=2; i*i <= n; i++) {
			if(n%i==0) {
				return "Not a Prime Number";
			}
			else {
				return "Prime Number";
			}
		}
		return "Null";
	}

	public static void main(String[] args) {
		PrimeNumber ob = new PrimeNumber();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(ob.isPrime(n));
		s.close();
	}

}
