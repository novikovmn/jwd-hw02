package by.epam.hw02.tasks;

/* 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. 
 */

public class Task26 {

	public static void main(String[] args) {

		// стороны треугольника
		double a = 11.0;
		double b = 17.0;

		// угол между ними
		double y = 30.0;

		// площадь треугольника
		double area = (a * b * Math.sin(Math.toRadians(y))) / 2;

		System.out.printf("Стороны треугольника: %.1f и %.1f\n", a, b);
		System.out.printf("Угол между ними: %.1f градусов\n", y);
		System.out.printf("Площадь: %.1f", area);
		

	}

}
