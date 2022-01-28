package banco;

public class Main {
	public static void main(String[] args) {
		
		Cliente pessoa = new Cliente();
		pessoa.setNomeCliente("Pessoa");
		
		Conta cc = new ContaCorrente(pessoa);
		Conta cp = new ContaPoupanca(pessoa);
		Banco bank = new Banco("Bank");
		
		bank.adicionarConta(cc);
		bank.adicionarConta(cp);
		
		cc.depositar(532.05);
		bank.listarContas();

	}

}