package pilha;

public class PilhaApp {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(10);
		pilha.push(1);
		pilha.push(4);
		pilha.push(7);
		pilha.push(3);
		pilha.push(5);
		pilha.push(8);
		pilha.push(11);
		pilha.push(20);
		pilha.push(14);
		pilha.push(50);
		System.out.println("Elemento do Topo >" +pilha.peek());
		System.out.println("Elemento Removido >" +pilha.pop());
		System.out.println("Elemento do Topo > "+pilha.peek());
		System.out.println("Elemento Removido >" +pilha.pop());
		System.out.println("Elemento do Topo > "+pilha.peek());
		System.out.println(pilha.isEmpty());
		System.out.println(pilha.getSize());
		
	}

}
