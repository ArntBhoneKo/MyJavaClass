package testProgram;
import java.util.*;
public class testAlpha {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str;
		System.out.print("Enter an alphabet");
		str=sc.next();
		switch(str) {
		case "a":System.out.print("vowel");break;
		case "e":
		case "i":
		case "o":
		case "u":System.out.print("vowel");break;
		default:System.out.print("consonant");break;
		}

	}

}
