package basic_Problems;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public void findArmstrong(int x) {
		int sum = 0 , temp = x ,lastdigit = 0;
		while(temp>0) {
			lastdigit = temp%10;
			sum += lastdigit * lastdigit * lastdigit;
			temp/=10;
		}
		
		if(sum == x) {
			System.out.println("it's an Armstrong number");
		}
		else {
			System.out.println("is not an Armstrong number");
		}
	}
	
	public static void main(String[] args) {
		ArmstrongNumber ob = new ArmstrongNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int x = s.nextInt();// number
		
		ob.findArmstrong(x);
		s.close();
	}

}


// by selvavignesh G R

