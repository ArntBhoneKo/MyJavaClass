package testProgram;
import java.util.*;
public class switchCase {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number");
		n=sc.nextInt();
		switch(n) {
		case 1:System.out.print("At the boundary");break;
		case 10:System.out.print("At the boundary");break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:System.out.print("in the range");break;
		default:System.out.print("Out of range");
		}
	}

}
