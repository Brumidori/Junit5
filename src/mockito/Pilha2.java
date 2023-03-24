package mockito;

import java.util.ArrayList;

import testes.unitarios.Livro;

public class Pilha2 {
	int limite = 5;
	
	public Pilha2(IPilhaDao pilhaDao) {
		this.pilhaDao = pilhaDao;
	}
	
	ArrayList<Livro> pilha = new ArrayList<Livro>();
	IPilhaDao pilhaDao;
	
	public void push (Livro livro) {
		if (pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		
		if(!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			return;
		}
		
		pilha.add(livro);
		pilhaDao.save();
	}
	
	public Livro pop() {
		Livro livro = pilha.get(pilha.size()-1);
		pilha.remove(pilha.size()-1);
		return livro;
	}
	
	public int contu() {
		return pilha.size();
	}
}
