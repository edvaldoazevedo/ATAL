package insercao;

import selecao.SelectionSort;

public class Teste {
	
	public static void main(String[] args) {
		
		int array[] = new int[10];
		array[0] = 1000;
		array[1] = 50;
		array[2] = 30;
		array[3] = 8;
		array[4] = 0;
		array[5] = 40;
		array[6] = 10000;
		array[7] = 3;
		array[8] = 2;
		array[9] = 9;
		
		int arrayOrdenado[] = InsertionSort.ordenaInsertionSort(array, 10);
		int ordenadoSelection[] = SelectionSort.ordenaSelectionSort(array);
		
		System.out.println("------Ordenado Com InsertionSort---------");
		
		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}
		
		System.out.println("-----Ordenado Com SelectSort-------");
		for (int i = 0; i < ordenadoSelection.length; i++) {
			System.out.println(ordenadoSelection[i]);
		}
		
	}

}
