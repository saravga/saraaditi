package javaprograms;

public class compareString {

	public static void main(String[] args) {
		String a = "Saravanan";
		String b = "saravanan";

		if (a.equals(b)) {
			System.out.println("Both strings are same");
		} else {
			System.out.println("Both strings are not same");
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both strings are same");
		} else {
			System.out.println("Both strings are not same");
		}
	}

}
//Java equals() method is used to compare strings.
//Java equalsIgnoreCase() method can ignore the case.
//We cannot use == operator to compare two strings.
