package javaprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		isArmStrongNumber(153);

	}

	public static void isArmStrongNumber(int num) {
		System.out.println("Given no is::"+ num);

		int t;
		int r = 0;
		int cube = 0;

		t = num; // 151

		while (num > 0) {
			r = num % 10;
			num=num/10;
			cube = cube+ (r*r*r) ;
		}
		if (t == cube) {
			System.out.println("This is an armstring number");
		} else {
			System.out.println("This is not an armstring  number");
		}

	}

	}

