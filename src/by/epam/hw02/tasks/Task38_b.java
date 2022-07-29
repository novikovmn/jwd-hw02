package by.epam.hw02.tasks;

/* Принадлежит ли точка  с  координатами (х,  у) 
принадлежит закрашенной области */

public class Task38_b {

	public static void main(String[] args) {
		
		System.out.println(checkCoord(0, 3));

	}
	
	public static boolean checkCoord(int x, int y) {
		if ((x >= -2 && x <= 2) && (y >= -3 && y <= 4)) {
			return true;
		} else if ((x < -2 || x > 2) && (y >= -3 && y <= 0)) {
			return true;
		}
		return false;
	}

}
