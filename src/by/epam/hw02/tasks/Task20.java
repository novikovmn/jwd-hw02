package by.epam.hw02.tasks;

/*20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. */

public class Task20 {

	public static void main(String[] args) {

		double l = 22;

		double area = (l * l) / 4 * Math.PI;
		
		System.out.println("Длина окружности = " + l);
		System.out.println("Тогда...");
		System.out.println("Площадь = " + area);
		

	}

}
