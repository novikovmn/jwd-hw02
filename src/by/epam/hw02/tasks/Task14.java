package by.epam.hw02.tasks;

/* 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R */

public class Task14 {

	public static void main(String[] args) {
		
		double r = 5.0; // радиус
		double pi = Math.PI;
		
		double area = pi * Math.pow(r, 2); // площадь круга
		
		double l = 2 * pi * r; // длина окружности
		
		System.out.printf("Радиус = %.1f\n", r);
		System.out.printf("Площадь = %.1f\n", area);
		System.out.printf("Длина окружности = %.1f\n", l);
		
		

	}

}
