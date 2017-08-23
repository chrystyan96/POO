package banco.logica;

public class Corrente extends Conta {

	public Corrente(int numConta, double saldoInicial) throws Exception{
		super(numConta, saldoInicial);
	}

	public void atualizarSaldo() throws Exception {
		if(this.getSaldoAtual() >= 1)
			this.setSaldoAtual(this.getSaldoAtual() - 1);
		else
			throw new Exception();
		
	}

	public void depositar(double deposito) {
		this.setSaldoAtual(this.getSaldoAtual() + deposito);
	}

	public void sacar(double saque) throws Exception {
		if(saque <= this.getSaldoAtual())
			this.setSaldoAtual(this.getSaldoAtual() - saque);
		else
			throw new Exception();
	}

	public double verSaldo() {
		return this.getSaldoAtual();
	}

}
