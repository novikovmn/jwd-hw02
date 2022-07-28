package by.epam.hw02.tasks;

/* 
19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной 
и описанной окружностей. 
*/

public class Task19 {

	public static void main(String[] args) {
		
		double a = 7;
		
		double area = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		double h = a * Math.sqrt(3) / 2;
		double R = a / Math.sqrt(3);
		double r = a * Math.sqrt(3) / 6;
		
		
		System.out.println("Сторона равностороннего треугольника = " + a);
		System.out.println("Тогда...");
		System.out.println("Площадь = " + area);
		System.out.println("Высота = " + h);
		System.out.println("Радиус описанной окружности = " + R);
		System.out.println("Радиус вписанной окружности = " + r);

	}

}
