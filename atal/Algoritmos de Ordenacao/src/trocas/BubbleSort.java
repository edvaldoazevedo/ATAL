package trocas;

public class BubbleSort {

	private static int aux = 0;

	public static int[] ordenaBubble(int[] array) {

		boolean troca = true;
		while (troca) {
			troca = false;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					troca = true;

				}
			}

		}
		return array;

	}
}
