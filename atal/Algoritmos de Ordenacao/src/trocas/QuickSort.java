package trocas;

public class QuickSort {

	private static int pivo;
	private static int i;
	private static int f;

	public static int[] ordenaQuickSort(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(array, inicio, fim);
			ordenaQuickSort(array, inicio, posicaoPivo - 1);
			ordenaQuickSort(array, posicaoPivo + 1, fim);
		}
		return array;

	}

	public static int separar(int[] array, int inicio, int fim) {
		pivo = array[inicio];
		i = inicio + 1;
		f = fim;
		while (i <= f) {
			if (array[i] <= pivo) {
				i++;
			} else if (pivo < array[f]) {
				f--;
			} else {
				int troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}

		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;

	}

}
