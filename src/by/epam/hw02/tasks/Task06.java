package by.epam.hw02.tasks;

/*
 * 6. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, 
если в каждом большом бидоне на 12 л. больше, чем в малом?
 * */

public class Task06 {

	public static void main(String[] args) {

		int n = 4; // кол-во малых бидонов
		int m = 7; // кол-во больших бидонов

		int nLiters = 80; // всего литров в малых бидонах

		int x = nLiters / n; // литров в одном малом бидоне

		int oneBigLiters = x + 12; // литров в одном большом бидоне

		int totalBigLiters = oneBigLiters * m;

		System.out.printf("В %d больших бидонах находится %d литр(а/ов) молока", m, totalBigLiters);

	}

}
