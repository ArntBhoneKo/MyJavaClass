package testProgram;
import java.util.Scanner;
public class Circlearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double radius,area;
		System.out.print("Enter Radius");
		radius=sc.nextDouble();
		area=3.142*radius*radius;
		System.out.print("Area of circle="+area);
		sc.close();
	}

}
