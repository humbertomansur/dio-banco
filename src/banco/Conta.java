package banco;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = Conta.SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void sacar (double valor) {
		saldo -= valor;
	};
	
	public void depositar (double valor) {
		saldo += valor;
	};
	
	public void transferir (double valor, Conta contaDestino) {
		this.sacar (valor);
		contaDestino.depositar(valor);
	};
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
