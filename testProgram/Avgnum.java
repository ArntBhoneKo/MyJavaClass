package testProgram;

import java.util.Scanner;

public class Avgnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2,num3,avg;
		System.out.print("Enter Three Number");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		num3=sc.nextDouble();
		avg=(num1+num2+num3)/3;
		System.out.print("Average of three number="+avg);
		sc.close();
	}

}
