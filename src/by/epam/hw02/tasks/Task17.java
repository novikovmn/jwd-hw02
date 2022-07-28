package by.epam.hw02.tasks;

/* 17. Даны два числа. Найти среднее арифметическое кубов этих чисел 
 * и среднее геометрическое модулей этих чисел. 
 */

public class Task17 {

	public static void main(String[] args) {

		double a = 7;
		double b = 5;

		System.out.printf("Даны два числа: %.0f и %.0f\n", a, b);
		System.out.println("Среднее геометрическое = " + avgGeom(a, b));
		System.out.println("Среднее арифметическое кубов = " + avgCubes(a, b));

	}

	public static double avgGeom(double a, double b) {
		return Math.sqrt(a * b);
	}

	public static double avgCubes(double a, double b) {
		return (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
	}
}
