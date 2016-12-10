package fila;

public class Fila {

	private int inicio = 0;
	private int fim = 0;
	private Object fila[];
	private int size = 0;

	public Fila(int tam) {
		fila = new Object[tam];
	}

	public void enfileirar(int elemento) {
		if (size == fila.length) {
			System.out.println("Fila Completa");
		} else {
			fila[fim] = elemento;
			fim++;
			size++;
		}

	}

	public Object desinfileirar() {
		if (size == 0) {
			System.out.println("Fila Vazia");
		}

		Object elemento = fila[inicio];
		fila[inicio] = null;
		inicio++;
		size--;
		return elemento;
	}

}
