package by.epam.hw02.tasks;

/*24. Найти площадь равнобедренной трапеции с основаниями а и  b  и углом α при 
 * большем основании а. 
*/

public class Task24 {

	public static void main(String[] args) {
		
		double angle = 45.0;
		double a = 11;
		double b = 7;
		
		double area = (a*b)/Math.sin(Math.toRadians(angle));
		
		System.out.printf("Основания равнобедренной трапеции равны %.0f и %.0f\n", a, b);
		System.out.printf("Тогда, если угол при большем основании = %.0f градусов, площадь трапеции = %.2f", angle, area);
		

	}

}
