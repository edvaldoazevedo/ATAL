package deque;

public class DequeApp {
	
	public static void main(String[] args) {
		 
		Deque deque = new Deque(5);
		deque.addPrimeiro(1);
		deque.addPrimeiro(4);
		deque.addPrimeiro(5);
		System.out.println(deque.removePrimeiro());
		System.out.println(deque.removeUltimo());
	}
	

}
