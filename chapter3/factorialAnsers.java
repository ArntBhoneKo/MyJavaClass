package chapter3;

public class factorialAnsers {

	public static void main(String[] args) {
		System.out.println("0!=1");
		int n;
		long fact=1;
		for(n=1;n<=20;n++)
		{
			fact*=n;
			System.out.println(n+"!="+fact);
		}
	}

}
