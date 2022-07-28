package by.epam.hw02.tasks;

/* 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное 
значение длительности в часах, минутах и секундах в следующей форме: 
ННч ММмин SSc. 
 */

public class Task22 {

	public static void main(String[] args) {

		int sec = 8600;

		int hours = sec / 3600;
		int minutes = (sec - (hours * 3600)) / 60;
		int seconds = sec - (hours * 3600) - (minutes * 60);

		System.out.println("Дано: " + sec + " секунд");
		
		System.out.printf("Это = %dч %dмин %dc", hours, minutes, seconds);
	}

}
