package banco;

import java.util.Iterator;
import java.util.ArrayList;

public class Banco {

	private String nomeBanco;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nome) {
		this.nomeBanco = nome;
	}
	
	public String getNomeBanco() {
		return nomeBanco;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void adicionarConta(Conta novaConta) {
		contas.add(novaConta);
	}

	public void listarContas () {
		Iterator<Conta> lista = contas.iterator();
		while (lista.hasNext())
		{
			System.out.println("-----------------------");
			lista.next().imprimirInfosComuns();
		}
	}
}
