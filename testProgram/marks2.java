package testProgram;

import java.util.Scanner;

public class marks2 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int m1,m2,m3;
		System.out.print("Input First Mark");
		m1=sc.nextInt();
		System.out.print("Input Second Mark");
		m2=sc.nextInt();
		System.out.print("Input Third Mark");
		m3=sc.nextInt();
		if(m1>=80 || m2>=80 || m3>=80)
			System.out.print("Disdiction");
		else if(m1>=65 && m2>=65 && m3>=65)
			System.out.print("Maried");
		else if(m1>=40 && m2>=40 && m3>=40)
			System.out.print("Pass");
		else if(m1<40 || m2<40 || m3<40)
			System.out.print("Fail");
		else if(m1>100 || m1<0 || m2>100 || m3>100 || m2<0 || m3>0)
			System.out.print("Error");
	}

}
