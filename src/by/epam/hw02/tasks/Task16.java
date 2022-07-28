package by.epam.hw02.tasks;

import java.util.Arrays;

/* 16. Найти произведение цифр заданного четырехзначного числа. 
 */

public class Task16 {

	public static void main(String[] args) {

		int number = 1234;
		int[] fourDigits = fetchEachDigit(number);
		int multiplyResult = multiplyFourDigits(fourDigits);
		System.out.printf("Умножили цифры числа %d.\n", number);
		System.out.printf("Результат = %d", multiplyResult);

	}

	public static int[] fetchEachDigit(int num) {
		int digit1 = num / 1000;
		int digit2 = (num / 100) % 10;
		int digit3 = (num / 10) % 10;
		int digit4 = num % 10;
		return new int[] { digit1, digit2, digit3, digit4 };
	}

	public static int multiplyFourDigits(int[] fourDigits) {
		return Arrays.stream(fourDigits).reduce((digit1, digit2) -> digit1 * digit2).getAsInt();
	}

}
