package testProgram;

import java.util.Scanner;

public class rectarea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double length,width,area;
		System.out.print("Enter Length and Width");
		length=sc.nextDouble();
		width=sc.nextDouble();
		area=length*width;
		System.out.print("Area of retangle="+area);
		sc.close();

	}

}
