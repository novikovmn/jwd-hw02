package by.epam.hw02.tasks;

/* 13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3).
 * Найти его периметр и площадь. 
 */

public class Task13 {

	public static void main(String[] args) {

		// A
		double x1 = -3;
		double y1 = 4;

		// B
		double x2 = 3;
		double y2 = 7;

		// C
		double x3 = 3;
		double y3 = 2;

		// расстояния между точками
		double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double CA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		// периметр
		double perimeter = AB + BC + CA;

		// полупериметр
		double halfPerimeter = perimeter / 2;

		// площадь
		double area = Math.sqrt(halfPerimeter * (halfPerimeter - AB) * (halfPerimeter - BC) * (halfPerimeter - CA));

		System.out.printf("Даны координаты вершин: (%.0f;%.0f), (%.0f;%.0f), (%.0f;%.0f)\n", x1, y1, x2, y2, x3, y3);
		System.out.printf("Периметр треугольника  = %.1f\n", perimeter);
		System.out.printf("Площадь треугольника  = %.1f\n", area);

	}

}
