package basic_Problems;
import java.util.Scanner;
public class CountDigits {
	
	public int findCount(int n) {
		int count =0, digit;
		while(n>0) {
			digit = n%10;
			n = n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		CountDigits dig = new CountDigits();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(dig.findCount(n));
		s.close();
	}

}
