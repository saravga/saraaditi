package javaprograms;

public class Reversestring {

	public static void main(String[] args) {
		String s = "Baby is on the way";
		String reverse = "";
		int length = s.length();

		for (int i = length-1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		
		
		StringBuffer ss = new StringBuffer(s);
		System.out.println(ss.reverse());
		System.out.println(new StringBuffer(String.valueOf(ss)).reverse());
		
	}

}
