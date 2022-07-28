package by.epam.hw02.tasks;

/*1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное. 
*/

public class Task01 {

	public static void main(String[] args) {

		double x = 25.0;
		double y = 5.0;
		
		System.out.printf("Дано: x = %.1f; y = %.1f\n", x, y);
		System.out.println("=================================");
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		
	}

}
