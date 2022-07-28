package by.epam.hw02.tasks;

/* 5. Составить алгоритм нахождения среднего арифметического двух чисел */

public class Task05 {

	public static void main(String[] args) {
		
		double a = 11;
		double b = 45;

		System.out.printf("Среднее арифметическое %.1f и %.1f = %.1f", a, b, avg(a, b));
		
	}

	public static double avg(double a, double b) {
		return (a + b) / 2;
	}

}
