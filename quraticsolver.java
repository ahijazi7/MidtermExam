import java.lang.*;
public class quraticsolver { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		int a = 12;
		int b = 31;
		int c = 7;
=======
		int a = 11;
		int b = 323;
		int c = 223;
>>>>>>> e348e2592c0343e2cc7e38483625d48608eb5471
		if (b*b - 4*a*c <0)
			System.out.println("This equation " + a + "x^2 + " + b +"x + " + c +" has no solution");
		else
			{
				System.out.println("The solution for the equation " + a + "x^2 + " + b +"x + " + c +" are");
				System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a + " and " + (-b-Math.sqrt(b*b-4*a*c))/2*a);
			}
	}

}

