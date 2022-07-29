package by.epam.hw02.tasks;

public class Task37_6 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 15;

		System.out.printf("Равнобедренный ли треугольник со сторонами %d, %d и %d\n", a, b, c);
		System.out.printf("Ответ: %b", checkTriangle(a, b, c));
	}

	public static boolean checkTriangle(int a, int b, int c) {

		if ((a == b && (a != c && b != c)) || (a == c && (a != b && c != b)) || (b == c && (b != a && c != a))) {
			return true;
		}

		return false;

	}

}
