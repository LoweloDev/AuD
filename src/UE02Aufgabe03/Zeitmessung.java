package UE02Aufgabe03;

public class Zeitmessung
{

	// Aufgabe b)
	private static int counter = 0;
	private static double tuwas()
	{
		return Math.random();
	}

	// Linear
	public static double func1(int n)
	{
		counter = 0;
		double summe = 0;

		for (int a = 0; a < n; a++) {
			summe += tuwas();
			counter++;
		}

		return summe;
	}

	// Quadratisch
	public static double func2(int n)
	{
		counter = 0;
		double summe = 0;

		for (int a = 0; a < n; a++)
			for(int b = 0; b < n; b++) {
				summe += tuwas();
				counter++;
			}

		return summe;
	}

	// log2(n)
	public static double func6(int n)
	{
		counter = 0;
		double summe = 0;

		while (n > 0)
		{
			summe += tuwas();
			n /= 2;
			counter++;
		}

		return summe;
	}

	public static void main(String[] args)
	{
		StopUhr stopUhr = new StopUhr();
		final int[] n = {100, 1000, 10000, 100000};

		for (int i : n) {
			stopUhr.start();
			final double summef1 = func1(i);
			stopUhr.stop();
			System.out.printf("Type: n, Summe: %f, Anzahl Tuwas: %d, Duration: %d \n", summef1, counter, stopUhr.getDuration());
			stopUhr.start();
			final double summef2 = func2(i);
			stopUhr.stop();
			System.out.printf("Type: n^2, Summe: %f, Anzahl Tuwas: %d, Duration: %d \n", summef2, counter, stopUhr.getDuration());
			stopUhr.start();
			final double summef3 = func6(i);
			stopUhr.stop();
			System.out.printf("Type: log n, logSumme: %f, Anzahl Tuwas: %d, Duration: %d \n", summef3, counter, stopUhr.getDuration());
		}
	}
}
