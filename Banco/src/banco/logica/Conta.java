package banco.logica;

public abstract class Conta implements Movimentacao{
	private int numConta;
	private double saldoAtual;
	
	public Conta(int numConta, double saldoInicial) throws Exception {
		this.setNumConta(numConta);
		if(saldoInicial > 0)
			this.setSaldoAtual(saldoInicial);
		else
			throw new Exception();
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
}
