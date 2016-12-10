package deque;

public class Deque {

	private Object array[];
	private int head;
	private int size;

	public Deque(int capacidade) {
		array = new Object[capacidade];
	}

	public void addPrimeiro(int elemento) {
		verificarCapacidade();
		if (head == 0) {
			array[(head = array.length -1)] = elemento;

		}
		array[(--head) % array.length] = elemento;

		size++;
	}

	public void verificarCapacidade() {
		if (array.length == size) {
			System.out.println("Deque is Full");
		}
	}

	public int removePrimeiro() {
		int removido = (int) array[head];
		 head = (head + 1) % array.length;
		 size--;

		return removido;
	}
	
	 public int removeUltimo() {
	   int ret = (int) array[(head + size - 1) % array.length];
	   size--;
	   return ret;
	 }

}
