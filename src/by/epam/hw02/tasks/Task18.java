package by.epam.hw02.tasks;

/* 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 
 */

public class Task18 {

	public static void main(String[] args) {

		double a = 5.0;

		double faceArea = a * a;
		double surfaceArea = 6 * faceArea;
		double volume = a * a * a;
		
		System.out.println("Ребро куба = " + a);
		System.out.println("Тогда...");
		System.out.println("Площадь грани = " + faceArea);
		System.out.println("Площадь поверхности = " + surfaceArea);
		System.out.println("Объем = " + volume);
		

	}

}
