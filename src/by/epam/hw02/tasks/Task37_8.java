package by.epam.hw02.tasks;

/* Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4)*/

public class Task37_8 {

	public static void main(String[] args) {
		
		int n = 16;
		int a = 2;
		
		System.out.printf("Является ли число %d степенью числа %d\n", n, a);
		System.out.printf("Ответ: %b\n", check(n, a));

	}
	
	public static boolean check(int n, int a) {
		if((Math.pow(a, 0) == n) || (Math.pow(a, 1) == n) || (Math.pow(a, 2) == n)
				|| (Math.pow(a, 3) == n) || (Math.pow(a, 4) == n)) {
			return true;
		}
		return false;
	}

}
