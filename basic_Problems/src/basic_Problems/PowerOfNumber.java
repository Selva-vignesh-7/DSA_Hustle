package basic_Problems;

import java.util.Scanner;

public class PowerOfNumber {  // x power reverse(x) is the qn;  from GFG
	
	public int solution(int x) { //number , reverse  // 10, 01
		int rev = 0;
		int temp = x;                   //here i made a dumb mistake of using the x straight for the reverse
		while(temp>0){                  //that causes the output to be zero thats resolved by using temp variable
			rev = (rev*10) + temp%10;    //reversing the given number for the power(n) variable
			temp/=10;
		}
		
		int n = rev;
		int ans = 1;
		
		while(n>0) {
			if(n%2==1) {                  //this is the fast binary exponentiation
				ans = x * ans;
				n = n-1;
			}
			else {
				n = n/2;
				x = x*x;
			}
		}
		return ans;

		//return (int) Math.pow(x, n);
		
	}
	
	public static void main(String[] args) {
		PowerOfNumber ob = new PowerOfNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base number :");
		int x = s.nextInt();// number
		//int n = s.nextInt();// power          //tried to give a reverse of a number for dry run
		
		System.out.println(ob.solution(x));
		s.close();
	}

}


// by selvavignesh G R