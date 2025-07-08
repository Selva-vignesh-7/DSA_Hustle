package basic_Problems;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintDivisiors {
	
	public ArrayList<Integer> findDivisiors(int n) {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=1; i*i <= n; i++) {
			if(n%i==0) {
				a.add(i);
				//System.out.println(i + " ");
				if(n/i!=i) {
					a.add(n/i);
				}
			}
		}
		a.sort(null);
		return a;
	}

	public static void main(String[] args) {
		PrintDivisiors ob = new PrintDivisiors();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(ob.findDivisiors(n));
		s.close();
		
	}

}
