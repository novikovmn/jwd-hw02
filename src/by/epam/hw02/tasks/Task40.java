package by.epam.hw02.tasks;

/*
 * 40. Дано значение х. Получить значения  -2х + 3х^2 - 4х^3  и 1 + 2х + 3х^2 + 4х^3 . 
 * Позаботьтесь об экономии операций. 
 * */

public class Task40 {

	public static void main(String[] args) {

		int x = 2;

		// 1е выражение
		int res1 = x * (-2 + x * (3 - 4 * x));

		// 2е выражение
		int res2 = 1 + x * (2 + x * (3 + 4 * x));
		
		System.out.printf("При х = %d, 1-е выражение = %d, 2-е = %d", x, res1, res2);

	}

}
