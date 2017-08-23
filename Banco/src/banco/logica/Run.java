package banco.logica;

public class Run {
	
	public void app() throws Exception {
		Conta conta1 = new Corrente(1, 100);
		Conta conta2 = new Poupanca(2, 100);
		Conta conta3 = new Poupanca(3, 100);
		Conta conta4 = new Poupanca(4, 100);
		
		
		Cliente c1 = new Cliente("Marcelo", conta1);
		
		Cliente c2 = new Cliente("Gabriel", conta2);
		
		Cliente c3 = new Cliente("Renan", conta3);
		
		Cliente c4 = new Cliente("Chrystyan", conta4);
		
		Banco bank = new Banco();
		bank.addCliente(c1);
		bank.addCliente(c2);
		bank.addCliente(c3);
		bank.addCliente(c4);
		
		int cont1 = bank.operarNumConta(1);
		bank.getCliente()[cont1].getConta().sacar(30);
		
		int cont2 = bank.operarPorNome("Marcelo");
		bank.getCliente()[cont2].getConta().depositar(34);
		
		for (int i = 0; i < bank.getCliente().length; i++) {
			bank.getCliente()[i].getConta().atualizarSaldo();
		}
				
		int cont3 = bank.operarNumConta(1);
		System.out.println("Saldo da 1ª Conta Corrente: " + bank.getCliente()[cont3].getConta().getSaldoAtual());
		
		System.out.println("O valor total guardado no banco é de: " + bank.valorTotalNoBanco());
		
	}

	public static void main(String[] args) throws Exception {
		(new Run()).app();
	}

}
