import java.util.Scanner;
public class FindEven {
	
	public boolean findEvenOrOdd(int k) {
		if((k & 1) == 0) {    // IF(K%2==0) OR IF(K==(K>>1)<<1)
			return true;
		}
		return false;
	}
	
	
	// Driver code 
	public static void main(String[] args) {
		int n;
		FindEven f = new FindEven();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		if(f.findEvenOrOdd(n)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		s.close();
	}

}
//by selvavignesh G R