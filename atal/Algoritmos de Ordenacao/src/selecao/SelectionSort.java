package selecao;

public class SelectionSort {

	private static int troca;
	private static int min;

	public static int[] ordenaSelectionSort(int[] vetor) {

		for (int i = 0; i < vetor.length - 1; i++) {
			min = i;
			for (int j = (i + 1); j < vetor.length; j++) {
				if (vetor[j] < vetor[i]) {
					min = j;
				}
			}
			if (i != min) {
				troca = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = troca;
			}
		}
		return vetor;
	}

}
