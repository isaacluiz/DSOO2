package modelos;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

	private List<T> pilha = new ArrayList<>();
	private int prox = 0;

	void push(T x) {
		this.pilha.add(this.prox++, x);

	}

	T pop() {
		return this.pilha.remove(--this.prox);
	}

	T top() {
		return this.pilha.get(this.prox - 1);

	}

	boolean empty() {
		return this.prox == 0;
	}

	boolean removeElement(T x) {
		this.prox--;// cf. aula
		return this.pilha.remove(x);
	}

}//