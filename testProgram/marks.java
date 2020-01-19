package testProgram;

import java.util.Scanner;

public class marks {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int m;char g=' ';
		System.out.print("Grade");
		m=sc.nextInt();
		if(m<=100 && m>=80)
			g='A';
		else if(m>=60)
			g='B';
		else if(m>=40)
			g='C';
		else if(m>=20)
			g='D';
		else if(m>=0)
			g='E';
		System.out.print("grade"+'='+g);
		if(m>100 && m<0)
		System.out.print("error");
	}

}
