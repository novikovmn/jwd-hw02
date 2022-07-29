package by.epam.hw02.tasks;

/* Вывести true/false если:
 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
*/

public class Task37_2 {

	public static void main(String[] args) {
		 
		System.out.println(isSumOfFirstPairAndLastPairEqual(2235));

	}
	
	
	public static boolean isSumOfFirstPairAndLastPairEqual(int number) {		 

		if (fourDigitsOrNot(number)) {
			// если число 4-значное - извлекаем каждую цифру
			int firstDigit = number / 1000;
			int secondDigit = (number / 100) % 10;
			int thirdDigit = (number / 10) % 10;
			int fourthDigit = number % 10;

			// проверяем равенство сумм 1й и последней пар цифр
			return firstDigit + secondDigit == thirdDigit + fourthDigit;
		}
	
		// если числе не 4-значное
		return false; 
		
	}
	

	
	public static boolean fourDigitsOrNot(int number) {

		if (number < 0)
			number *= -1; // избавляемся от минуса, если таковой есть

		int counter = 0;
		while (number > 0) {
			number /= 10; // кол-во таких делений и будет количеством цифр
			counter++;
		}

		return counter == 4 ? true : false;
	}
	

}
