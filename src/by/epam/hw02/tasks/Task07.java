package by.epam.hw02.tasks;

/* 7. Дан прямоугольник, 
 * ширина которого в два раза меньше длины. Найти площадь прямоугольника */

public class Task07 {

	public static void main(String[] args) {
		
		double length = 10.0;
		double width = length / 2;
		
		System.out.printf("Площадь прямоугольника с  длиной %.1f и "
				+ "шириной %.1f = %.1f",length, width, length * width);
		
	}

}
