package by.epam.hw02.tasks;

/* 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения 
информации. 
 */

public class Task34 {

	public static void main(String[] args) {

		double a = 56951613; // количество байтов
		double kb = a / 1024; // переводим в килобайты
		double mb = kb / 1024; // ереводим в мегабайты
		double gb = mb / 1024; // переводми в гигабайты		
		
		System.out.println("Дано " + a + " байтов.");
		System.out.println("Это соответствует: ");
		System.out.printf("\t%f килобайтам\n", kb);
		System.out.printf("\t%f мегабайтам\n", mb);
		System.out.printf("\t%f гигабайтам\n", gb);

	}

}
