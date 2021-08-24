package javaprograms;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n= 9;
		
		int f=3,s=5,t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}

	}

}
