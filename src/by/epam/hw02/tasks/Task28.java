package by.epam.hw02.tasks;

/* 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды. 
 */

public class Task28 {

	public static void main(String[] args) {

		// угол в радианах
		double rad = 5.0;

		// переводим радианы в градусы. убрав дробную часть
		double degree = (rad * 180) / Math.PI;
		int deg = (int) degree;

		// получаем минуты, убрав дробную часть
		double minutes = (degree % 1) * 60;
		int min = (int) minutes;

		// получаем секунды, убрав дробную часть
		double seconds = (minutes % 1) * 60;
		int sec = (int) seconds;
		
		System.out.printf("%.1f радиан = %d градусов %d минут %d секунд", rad, deg, min, sec);

	}

}
