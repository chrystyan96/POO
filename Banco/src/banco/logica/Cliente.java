package banco.logica;

public class Cliente {
	private Conta conta;
	private String nome;
	
	public Cliente(String nome, Conta conta) {
		this.setNome(nome);
		this.setConta(conta);
	}
	
	public Conta getConta() {
		return conta;
	}
	
	private void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}
}
