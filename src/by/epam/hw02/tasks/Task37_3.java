package by.epam.hw02.tasks;

/* Сумма цифр данного трехзначного числа N является четным числом. */

public class Task37_3 {

	public static void main(String[] args) {

		
		System.out.println(checkIfSumOfDigitsIsEvenNumber(112));
	}

	public static boolean checkIfSumOfDigitsIsEvenNumber(int number) {
		if(threeDigitsOrNot(number)) {
			// извлекаем цифры
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			// проверяем их сумму
			return (firstDigit + secondDigit + thirdDigit) % 2 == 0 ? true : false;
		}
		
		// если число не 3-значное
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
