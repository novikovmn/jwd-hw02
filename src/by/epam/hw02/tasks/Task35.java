package by.epam.hw02.tasks;

/* 
35. Даны натуральные числа М и N. Вывести старшую цифру дробной части
 и младшую цифру целой части числа M/N. */

public class Task35 {

	public static void main(String[] args) {

		double m = 800;
		double n = 41;		

		double result = m / n;

		int beforeComma = (int) (result - (result % 1));
		System.out.println("Дано число " + result);
		int lowDigitOfIntegerPart = beforeComma % 10;
		System.out.println("Младшая цифра целой части = " + lowDigitOfIntegerPart);

		double afterComma = result % 1;
		int highDigitOfFractionalPart = (int) ((afterComma / 0.1) - ((afterComma / 0.1) % 1));

		System.out.println("Старшая цифра дробной части = " + highDigitOfFractionalPart);
	}

}
