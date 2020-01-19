//Write java program that accept two times(hr,min,sec)from user and calculate the two times
package testProgram;
import java.util.Scanner;
public class SumofTwotimes {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int h1,h2,m1,m2,s1,s2;
		int h=0,m=0,s=0;
		System.out.print("Enter first hours");
		h1=sc.nextInt();
		System.out.print("Enter first minuts");
		m1=sc.nextInt();
		System.out.print("Enter first seconds");
		s1=sc.nextInt();
		System.out.print("Enter second hours");
		h2=sc.nextInt();
		System.out.print("Enter second minuts");
		m2=sc.nextInt();
		System.out.print("Enter second seconds");
		s2=sc.nextInt();
		s=s1+s2;
		m=m1+m2;
		h=h1+h2;
		if(s>60) {
			s-=60;
			m+=1;
		}
		if(m>60) {
			m-=60;
			h+=1;
		}
		System.out.print(h+":"+m+":"+s);


	}

}
