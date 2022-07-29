package by.epam.hw02.tasks;

/*30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения. 
 * 
 * ВАЖНО: формула тут - https://go-radio.ru/connection-of-resistors.html
 * */

public class Task30 {

	public static void main(String[] args) {

		double r1 = 126;
		double r2 = 632;
		double r3 = 194;

		double totalR = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
		
		System.out.printf("Общее сопротивление = %f", totalR);

	}

}
