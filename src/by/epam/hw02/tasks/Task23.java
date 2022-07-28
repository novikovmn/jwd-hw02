package by.epam.hw02.tasks;

/* 
23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). */

public class Task23 {

	public static void main(String[] args) {
		
		double r = 6;
		double R = 10;
		
		double area = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		
		System.out.println("Дано: r  = " + r + "; R = " + R);
		System.out.println("Тогда площадь кольца = " + area);

	}

}
