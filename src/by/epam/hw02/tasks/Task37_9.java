package by.epam.hw02.tasks;

/*
 *  График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). 
 *  
 *  Подсказка: https://studassistent.ru/turbo-pascal/sostavit-programmu-opredelyayuschuyu-proydet-li-grafik-funkcii-y-ax-2-bx-c-cherez-zadannuyu-tochku-s-koordinatami-n-m-turbo-pascal
 * */

public class Task37_9 {

	public static void main(String[] args) {

		double m = 3; // x
		double n = 5; // y

		double a = 1.0;
		double b = 3.0;
		double c = -4.0;

		double y = a * Math.pow(m, 2) + b * m + c;

		if (y == n) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
