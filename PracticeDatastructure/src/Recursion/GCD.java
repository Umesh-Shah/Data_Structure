package Recursion;

public class GCD {

	public int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		GCD divisior = new GCD();
		System.out.println(divisior.gcd(10, 2));
	}

}
