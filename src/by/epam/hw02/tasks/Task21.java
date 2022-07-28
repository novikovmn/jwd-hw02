package by.epam.hw02.tasks;

/*21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Task21 {

	public static void main(String[] args) {
		double num = 123.456;
		
		char[] charArray = String.valueOf(num).toCharArray();
		
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length / 2  + 1 + i];
			charArray[charArray.length / 2  + 1 + i] = temp;
		}
			
		double result = Double.parseDouble(new String(charArray));
		
		System.out.println("До: " + num);
		System.out.println("После: " + result);

	}

}
