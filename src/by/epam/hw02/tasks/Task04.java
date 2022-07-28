package by.epam.hw02.tasks;

/* 4. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c. 
 */

public class Task04 {

	public static void main(String[] args) {

		System.out.println("z = " + calcFunction(5, 11, 3));

	}

	public static double calcFunction(double a, double b, double c) {
		return ((a - 3) * b / 2) + c;
	}

}
