/*write a java program to calculate four function calculator.
*User accept two numbers and oprator
*Calculate two numbers according to operator*/
package testProgram;
import java.util.Scanner;
public class calculator {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n1,n2;
		int ans=0;
		String op;
		System.out.print("enter two number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.print("Enter operator(+,-,*,/)");
		op=sc.next();
		
		if(op.equals("+"))ans=n1+n2;
		else if(op.equals("-"))ans=n1-n2;
		else if(op.equals("*"))ans=n1*n2;
		else if(op.equals("/"))ans=n1/n2;
		
		System.out.print("Answer="+ans);
		sc.close();
	}

}
