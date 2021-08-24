package javaprograms;

public class Removejunk {

	public static void main(String[] args) {
		String s = "#$%#%#%#% Saravanan Gandhi *%$ 1234 ";
		s = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
		

	}

}
