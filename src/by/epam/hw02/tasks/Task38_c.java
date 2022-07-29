package by.epam.hw02.tasks;

/* Принадлежит ли точка  с  координатами (х,  у) 
принадлежит закрашенной области */

public class Task38_c {

	public static void main(String[] args) {
		
		System.out.println(checkCoord(3, -1));

	}

	public static boolean checkCoord(int x, int y) {

		if (((x >= 0 && x <= 3) && (y >= 0 && y <= 2)) || ((x >= 0 && x <= 2) && (y >= 0 && y <= 3))) {
			return true;
		} else if (((x >= 0 && x <= 1) && (y >= -5 && y <= 0)) || ((x >= 0 && x <= 3) && (y >= -4 && y <= 0))
				|| ((x >= 0 && x <= 4) && (y >= -3 && y <= 0))) {
			return true;
		}

		return false;
	}

}
