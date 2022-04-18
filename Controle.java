package PacoteControle;

import PacoteEmpregado.Empregado;

public class Controle {

	private Empregado[] lista;
	private int indice;
	
	public Controle(int tamanho) {
		lista = new Empregado[tamanho];
		this.indice = 0;
	}
	
	public void inserir(Empregado empregado) {
		if(indice < lista.length) {
			lista[indice] = empregado;
		}
	}
	
	public Empregado pesquisar() {
		
	}
}
