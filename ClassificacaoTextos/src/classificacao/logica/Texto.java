package classificacao.logica;

public class Texto {
	private Palavra[] texto;
	
	public Texto() {
		this.texto = new Palavra[0];
	}
	
	public void setTexto(Palavra s) {
		Palavra[] nova = new Palavra[this.texto.length+1];
		for(int i = 0; i < this.texto.length; i++) {
			nova[i] = this.texto[i];
		}
		nova[nova.length-1] = s;
		this.texto = nova;
	}
	
	public void similaridadeTextos(Texto t) {
		
	}
}
