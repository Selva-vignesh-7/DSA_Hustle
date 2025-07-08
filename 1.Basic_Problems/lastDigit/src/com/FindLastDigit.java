package com;
import java.util.Scanner;

public class FindLastDigit {
	
	public int solution(int k) {
		int result = k%10;
		return result;
	}

	public static void main(String[] args) {
		FindLastDigit digit = new FindLastDigit();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(digit.solution(n));
		s.close();
	}

}
