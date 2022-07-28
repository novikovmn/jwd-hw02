package by.epam.hw02.tasks;

/* 15. Написать программу, которая выводит на экран первые четыре степени числа π. 
 */

public class Task15 {
	
	public static void main(String[] args) {
		
		double pi = Math.PI;		
		for (int i = 1; i <= 4; i++) {
			System.out.printf("%d-я степень числа %f = %f\n", i, pi, Math.pow(pi, i));
		}
		
	}

}
