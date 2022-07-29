package by.epam.hw02.tasks;

/*31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость 
течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. */

public class Task31 {

	public static void main(String[] args) {

		int v = 20; // скорость лодки в спокойной воде км/ч
		int v1 = 2; // скорость течения реки км/ч
		int t1 = 3; // время движения в спокойной воде ч
		int t2 = 2; // время движения против течения ч

		int distance1 = v * t1; // путь в спокойной воде
		int distance2 = (v - v1) * t2; // путь против течения

		System.out.printf("Путь лодки в спокойной воде составит %d км, а против течения - %d км", distance1,
				distance2);

	}

}
