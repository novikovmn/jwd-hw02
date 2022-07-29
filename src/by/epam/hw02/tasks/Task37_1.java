package by.epam.hw02.tasks;

/*Составить линейную программу, печатающую значение true/false:
 *  Целое число N является четным двузначным числом.
 * */

public class Task37_1 {
	
	public static void main(String[] args) {
		
		int number = 22;
		System.out.printf("Является ли число %d четным и двухзначным? -> %b",number,  check(number));
		
	}
	
	// основной метод проверки
	public static boolean check(int number) {
		if(checkIfThereAreTwoDigits(number) && isEvenNumber(number)) {
			return true;
		}
		return false;
	}
	
	// проверка на четность
	public static boolean isEvenNumber(int number) {
		return number % 2 == 0 ? true : false;
	}
	
	// проверка двухзначности
	public static boolean checkIfThereAreTwoDigits(int number) {
		
		if(number < 0) {
			number *= -1;
		}
		
		int counter = 0;
		
		while(number > 0) {
			number /= 10;
			counter++;
		}
		
		return counter == 2 ? true : false;		
	}

}
