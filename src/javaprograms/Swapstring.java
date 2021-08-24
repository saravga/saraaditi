package javaprograms;

public class Swapstring {

	public static void main(String[] args) {
		String a = "Saravanan";
		String b = "Saranya";

		// Append a+b
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
