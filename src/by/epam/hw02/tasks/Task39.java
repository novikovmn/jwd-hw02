package by.epam.hw02.tasks;

/* 39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
 * кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
				2x^4 - 3x^3 + 4x^2 - 5x + 6

Объяснение тут: https://www.youtube.com/watch?v=J421fgDvX0c  (смотреть с 19-й минуты)

*/

public class Task39 {

	public static void main(String[] args) {
		
		int x = 2;		
		int result = x * (x * (x * (2*x-3) + 4) - 5) + 6;

		System.out.printf("При x = %d, результат = %d", x, result);
	}

}
