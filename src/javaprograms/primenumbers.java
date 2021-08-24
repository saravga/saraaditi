package javaprograms;

public class primenumbers {

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(5));
		getPrimeNumber(100);

	}

}

/*
 * public static boolean isPrimeNumber(int num) { if(num<=1) { return false; }
 * for(int i=2;i<num;i++) { if(num % i ==0) { return false; } } return true; }
 * 
 * public static void getPrimeNumbers(int num) { for(int i=2;i<=num;i++) {
 * if(isPrimeNumber(i)) System.out.println(i); } }
 * 
 * public static void main(String[] args) {
 * System.out.println(isPrimeNumber(2)); System.out.println(isPrimeNumber(10));
 * System.out.println(isPrimeNumber(24)); getPrimeNumbers(9);
 * 
 * }
 * 
 * }
 */
