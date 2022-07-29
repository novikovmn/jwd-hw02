package by.epam.hw02.tasks;

/* Выведи true/false.
 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. */

public class Task37_5 {

	public static void main(String[] args) {

		System.out.println("Есть ли 3-значные числа соответствующие условию задачи.");
		System.out.println("Ответ: " + checkNumbersFrom100To999(100, 999));

	}

	public static boolean checkNumbersFrom100To999(int from, int to) {
		boolean flag = false;
		for (int i = from; i <= to; i++) {
			if (checkIfSquareOfNumberEqualToCubeOfSumOfDigitsOfThisNumber(i)) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean checkIfSquareOfNumberEqualToCubeOfSumOfDigitsOfThisNumber(int number) {
		if (threeDigitsOrNot(number)) {
			// извлекаем цифры
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			// проверяем
			return Math.pow(number, 2) == Math.pow(firstDigit + secondDigit + thirdDigit, 3) ? true : false;
		}

		return false;
	}

	// проверяем количество цифр
	public static boolean threeDigitsOrNot(int number) {
		if (number < 0) {
			number *= -1;
		}

		int counter = 0;
		while (number > 0) {
			number /= 10;
			counter++;
		}

		return counter == 3 ? true : false;
	}
}
