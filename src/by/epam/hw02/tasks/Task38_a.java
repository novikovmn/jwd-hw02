package by.epam.hw02.tasks;

/* Принадлежит ли точка  с  координатами (х,  у) 
принадлежит закрашенной области */

public class Task38_a {

	public static void main(String[] args) {
		
		System.out.println(checkCoord(10, 12));

	}

	public static boolean checkCoord(int x, int y) {

		if ((x == 0 && y == 4) || (x == 4 && y == 0) || (x == -4 && y == 0)) {
			return true;
		} else if (((x >= -3 && x <= 3) && (y >= 0 && y <= 1)) || ((x >= 2 && x <= 2) && (y >= 0 && y <= 2))
				|| ((x >= -1 && x <= 1) && (y >= 0 && y <= 3))) {
			return true;
		}

		return false;
	}

}
