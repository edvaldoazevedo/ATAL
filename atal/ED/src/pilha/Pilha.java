package pilha;

public class Pilha {

	private int topo = 0;
	private Object vetor[];

	public Pilha(int capacidade) {
		vetor = new Object[capacidade];
		topo = 0;

	}

	public Object push(int elemento) {
		if (topo > vetor.length) {
			System.out.println("N�o pode Adicionar Na Pilha");
		}
		vetor[topo] = elemento;
		topo++;
		return elemento;
	}

	public Object peek() {
		int elemento = (int) vetor[topo - 1];
		return elemento;
	}

	public Object pop() {
		int removido = (int) vetor[topo - 1];
		vetor[topo - 1] = null;
		topo--;
		return removido;

	}

	public Object getSize() {
		return vetor.length;
	}

	public boolean isEmpty() {
		if (topo == vetor.length) {
			return true;
		}
		return false;
	}

}