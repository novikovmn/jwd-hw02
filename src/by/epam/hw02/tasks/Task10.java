package by.epam.hw02.tasks;

/* 10. Вычислить значение выражения по формуле  */

public class Task10 {

	public static void main(String[] args) {

		System.out.println("Ответ: " + calc(2.5, 11.0));
		
	}

	public static double calc(double x, double y) {
		return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
	}

}
