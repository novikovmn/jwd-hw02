package by.epam.hw02.tasks;

/*36. Найти частное произведений четных и нечетных цифр четырехзначного числа. 
*/

public class Task36 {

	public static void main(String[] args) {

		int number = 4449;
		System.out.println("4-х значное число = " + number);
		
		int even = 1;
		int odd = 1;
		
		while(number > 0) {
			int digit = number % 10;
			if(digit % 2 == 0) {
				even *= digit;
			}else {
				odd *= digit;
			}
			number /= 10;
		}		
		
		System.out.println("Произведение четных цифр = " + even);
		System.out.println("Произведение нечетных цифр = " + odd);
		System.out.println("Их частное = " + (double)even/odd);

	}

}
