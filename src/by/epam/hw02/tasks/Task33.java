package by.epam.hw02.tasks;

/* 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 
 */

public class Task33 {

	public static void main(String[] args) {

		char input = '$';
		int inputPosition = input;

		char prev = (char) (inputPosition - 1);
		int prevPosition = prev;

		char next = (char) (inputPosition + 1);
		int nextPosition = next;

		System.out.printf("Текущий символ -> %c. Его позиция -> %d\n", input, inputPosition);
		System.out.printf("Предыдущий символ -> %c. Его позиция -> %d\n", prev, prevPosition);
		System.out.printf("Следующий символ -> %c. Его позиция -> %d\n", next, nextPosition);

	}

}
