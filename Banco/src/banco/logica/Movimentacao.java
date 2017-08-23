package banco.logica;

public interface Movimentacao {
	public void atualizarSaldo() throws Exception;
	public void depositar(double deposito);
	public void sacar(double saque) throws Exception;
	public double verSaldo();
}
