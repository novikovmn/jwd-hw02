package by.epam.hw02.tasks;

/* 3. Найдите  значение функции: z = 2 * x + ( y – 2 ) * 5 */

public class Task03 {

	public static void main(String[] args) {

		System.out.println("z = " + calculateFunction(5, 8));

	}

	public static int calculateFunction(int x, int y) {
		return 2 * x + (y - 2) * 5;
	}

}
