package by.epam.hw02.tasks;

/* 2. Найдите  значение функции: с = 3 + а. 
 */

public class Task02 {

	public static void main(String[] args) {
		
		int c = calculateFunction(15);
		
		System.out.println(c);
	}

	
	public static int calculateFunction(int a) {
		return 3 + a;
	}
}
