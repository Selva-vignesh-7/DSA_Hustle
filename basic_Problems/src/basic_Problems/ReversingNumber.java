package basic_Problems;

import java.util.Scanner;

public class ReversingNumber {
	
	public int toReverse(int k) {
		int result=0;
		while(k>0) {
			result= (result*10) + k%10;  // reverse = reverse * 10 + remainder;
			k/=10;                       // num = num/10 for resetting the process
			
		}
		return result;
	}

	public static void main(String[] args) {
		ReversingNumber ob = new ReversingNumber();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(ob.toReverse(n));
		
		s.close();
	}

}

// by selvavignesh G R
