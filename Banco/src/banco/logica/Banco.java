package banco.logica;

public class Banco{
	private Cliente[] clientes;
	
	public Banco() {
		this.clientes = new Cliente[0];
	}
	
	public Cliente[] getCliente() {
		return this.clientes;
	}
	
	public void addCliente(Cliente c) {
		Cliente[] novo = new Cliente[this.clientes.length+1];
		for (int i = 0; i < this.clientes.length; i++) {
			novo[i] = this.clientes[i];
		}
		novo[novo.length-1] = c;
		this.clientes = novo;
	}
	
	public boolean igualNomeCliente(String nome, Cliente c2) {
		return nome == c2.getNome();
	}
	
	public boolean igualNumContaCliente(int numConta, Cliente c2) {
		return numConta == c2.getConta().getNumConta();
	}
	
	public int operarPorNome(String nome) {
		for (int i = 0; i < this.clientes.length; i++) {
			if(igualNomeCliente(nome, this.clientes[i])) {
				return i;
			}
		}			
		return -1;
	}
	
	public int operarNumConta(int NumConta) {
		for (int i = 0; i < this.clientes.length; i++) {
			if(igualNumContaCliente(NumConta, this.clientes[i])) {
				return i;
			}
		}			
		return -1;
	}
	
	public double valorTotalNoBanco() {
		int aux = 0;
		for (int i = 0; i < this.getCliente().length; i++) {
			aux += this.getCliente()[i].getConta().getSaldoAtual();
		}
		return aux;
	}

}
