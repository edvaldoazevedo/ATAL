package insercao;

public class InsertionSort {

	private static int i;
	private static int j;
	private static int chave;

	public static int[] ordenaInsertionSort(int[] array, int n) {

		for (int j = 1; j < n; j++) {
			chave = array[j];
			i = j - 1;

			while (i >= 0 && array[i] > chave) {
				array[i + 1] = array[i];
				i--;

			}
			array[i + 1] = chave;
		}
		return array;

	}

}