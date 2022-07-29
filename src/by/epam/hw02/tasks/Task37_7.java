package by.epam.hw02.tasks;

/* Выведи true/false если:
 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
*/

public class Task37_7 {

	public static void main(String[] args) {

		System.out.println(check(224));

	}

	public static boolean check(int number) {
		// извлекаем цифры
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;

		// проверяем суммы
		if ((firstDigit + secondDigit == thirdDigit) || (secondDigit + thirdDigit == firstDigit)
				|| (firstDigit + thirdDigit == secondDigit)) {
			return true;
		}

		return false;

	}

}
