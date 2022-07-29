package by.epam.hw02.tasks;

/*  Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= п (m<п).  */

public class Task37_4 {

	public static void main(String[] args) {

		// координаты точки
		int x = 3;
		int y = 5;

		// точки на оси x, через которые проходят перпендикулярные ей прямые
		int m = 2;
		int n = 10;

		System.out.printf("Дана точка с координатами (%d;%d)\n", x, y);
		System.out.printf("Принадлежит ли эта точка плоскости меджу прямыми, проходящими "
				+ "перпендикулярно оси Х в точках %d и %d?\n", m, n);
		System.out.printf("Ответ: %b", checkCoord(x, m, n));

	}

	public static boolean checkCoord(int x, int m, int n) {
		if (x >= m && x <= n) {
			// если x лежит в переделах от m до n
			// и соответственно не важно какой y (т.к. точка (x;y) принадлежит нужной
			// плоскости)
			return true;
		}
		// если х выходит за рамки обозначенные m и n
		return false;
	}

}
