package javaprograms;

public class Palindrom {

	public static void main(String[] args) {

		isPalindromNumber(1551);

	}

	public static void isPalindromNumber(int num) {
		System.out.println("Given no is::"+ num);

		int t;
		int r = 0;
		int sum = 0;

		t = num; // 1551

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum * 10) + r;

		}
		if (t == sum) {
			System.out.println("It a palindrom number");
		} else {
			System.out.println("It is not a palindrom number");
		}

	}

}
