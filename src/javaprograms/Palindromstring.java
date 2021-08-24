package javaprograms;

public class Palindromstring {

	public static void main(String[] args) {
	     String t="madam";      


	            StringBuffer reversestring = new StringBuffer(String.valueOf(t)).reverse();
	            System.out.println(reversestring);
	    if(t.contentEquals(reversestring)) {
	        System.out.println("It is a PALINDROME");
	    }
	    else {
	        System.out.println("It is NOT a PALINDROME");
	    }
	}

}

/*{
String str, rev = "";
Scanner sc = new Scanner(System.in);

System.out.println("Enter a string:");
str = sc.nextLine();

int length = str.length();

for ( int i = length - 1; i >= 0; i-- )
   rev = rev + str.charAt(i);

if (str.equals(rev))
   System.out.println(str+" is a palindrome");
else
   System.out.println(str+" is not a palindrome");

}*/ //https://www.w3schools.in/java-program/check-palindrome-string/