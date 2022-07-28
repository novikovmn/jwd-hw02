package by.epam.hw02.tasks;

import java.util.Scanner;

/* 9. Вычислить значение выражения */

public class Task09 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		double a = sc.nextDouble();
		System.out.print("Введите число b: ");
		double b = sc.nextDouble();
		System.out.print("Введите число c: ");
		double c = sc.nextDouble();
		System.out.print("Введите число d: ");
		double d = sc.nextDouble();

		System.out.printf("Ответ = %.2f", calc(a, b, c, d));

	}

	public static double calc(double a, double b, double c, double d) {
		return (a / c) * (b / d) - (a * b - c) / c * d;
	}
}
