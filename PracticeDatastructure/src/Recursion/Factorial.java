package Recursion;

public class Factorial {

	public int recursion(int num) {

		if (num == 0) {
			return 1;
		} else {
			num = num * recursion(num - 1);
		}
		return num;

	}

	public static void main(String[] args) {

		Factorial f = new Factorial();
		System.out.println(f.recursion(10));

	}
}
