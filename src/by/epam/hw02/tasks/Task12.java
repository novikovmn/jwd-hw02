package by.epam.hw02.tasks;

/* 12. Вычислить расстояние между двумя точками с данными 
 * координатами (х1, у1)и (x2, у2).  */

public class Task12 {

	public static void main(String[] args) {

		// точка 1
		double x1 = -1;
		double y1 = 3;

		// точка 2
		double x2 = 6;
		double y2 = 2;

		double distanceBetween = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.printf("Расстояние между точками (%.0f;%.0f) и (%.0f;%.0f) = %.2f", x1, y1, x2, y1, distanceBetween);

	}

}
