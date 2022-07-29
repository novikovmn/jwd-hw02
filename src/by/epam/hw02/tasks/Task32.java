package by.epam.hw02.tasks;

/*32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
 * Какое время будут показывать часы через р ч q мин r с? 
 * 
 * Объяснение тут: http://borland.ru/rzadach/zadacha-543/
 * 
 * */

public class Task32 {

	public static void main(String[] args) {

		// исходное время
		int m = 21; // часы
		int n = 57; // минуты
		int k = 55; // секунды

		System.out.printf("Исходное время -> %dч %dмин %dс\n", m, n, k);

		// добавляемое время
		int p = 7; // часы
		int q = 13; // минуты
		int r = 15; // секунды

		// прибавляем
		m += p;
		n += q;
		k += r;

		m = (m + (n + (k / 60)) / 60) % 24;
		n = (n + (k / 60)) % 60;
		k = k % 60;

		System.out.printf("Время после добавления -> %dч %dмин %dс\n", m, n, k);

	}

}
