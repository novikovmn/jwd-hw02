package by.epam.hw02.tasks;

/* 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. 
 * 
 * ПАМЯТКА: решение объясняется тут - https://www.programmersforum.ru/showthread.php?t=271675
 * */

public class Task29 {

	public static void main(String[] args) {

		double a = 15.0;
		double b = 7.0;
		double c = 9.0;

		// по теореме косинусов
		double cosAC = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
		double cosAB = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		double cosBC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);

		// радианы
		double arccosAC = Math.acos(cosAC);
		double arccosAB = Math.acos(cosAB);
		double arccosBC = Math.acos(cosBC);

		// градусы
		double degreesAC = (arccosAC * 180) / Math.PI;
		double degreesAB = (arccosAB * 180) / Math.PI;
		double degreesBC = (arccosBC * 180) / Math.PI;

		System.out.printf("\tПри сторонах треугольника: %.1f, %.1f и %.1f:\n", a, b, c);

		System.out.printf("угол между соронами А и С в градусах и радианах соответственно: %f <-> %f\n", degreesAC,
				arccosAC);
		System.out.printf("угол между соронами А и В в градусах и радианах соответственно: %f <-> %f\n", degreesAB,
				arccosAB);
		System.out.printf("угол между соронами В и С в градусах и радианах соответственно: %f <-> %f\n", degreesBC,
				arccosBC);

	}

}
