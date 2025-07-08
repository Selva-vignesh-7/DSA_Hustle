package basic_Problems;

import java.util.Scanner;

public class Gcd {
	
	public int findGcd(int n1, int n2) {                         //Euclidiean algorithm 
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1 = n1%n2;
			}
			else {
				n2 = n2%n1;
			}
		}
		if(n1==0) return n2;
		else return n1;
	}
	
/*  general method of finding gcd of a number
 * 
	for(int i= Math,min(n1,n2); i > 0; i--) {
		if(n1%i==0 && n2%i==0) {
			System.out.println(i); //return i;
			break;
		}
	}
*/
	
	

	public static void main(String[] args) {
		Gcd ob = new Gcd();
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println(ob.findGcd(n1, n2));
		s.close();
	}

}
