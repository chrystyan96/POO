package classificacao.logica;

import java.util.Arrays;

public class Palavra {
	private String palavra;
	Palavra[] similares;
	
	public Palavra(String palavra) {
		this.setPalavra(palavra);
		this.similares = new Palavra[0];
	}
	
	public Palavra(String palavra, Palavra similar) {
		this(palavra);
		this.setSimilares(similar);
		this.similares(similar);
	}

	public String getPalavra() {
		return this.palavra;
	}

	private void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	private void similares(Palavra p) {
		for(int i = 0; i < p.getSimilares().length; i++)
			this.setSimilares(p.getSimilares()[i]);
	}

	public Palavra[] getSimilares() {
		return this.similares;
	}
	
	public void setSimilares(Palavra s) {
		Palavra[] nova = new Palavra[this.similares.length+1];
		for(int i = 0; i < this.similares.length; i++) {
			nova[i] = this.similares[i];
		}
		nova[nova.length-1] = s;
		this.similares = nova;
	}
	
	public boolean equals(Palavra p) {
		return this.getPalavra().equals(p.getPalavra());
	}
	
	public boolean equals(String p, String p2) {
		return p.equals(p2);
	}
	
	public boolean contemNaSimilaridade(Palavra p) {
		for(Palavra pala : p.getSimilares())
			if(this.equals(p)){
				return true;
			}
		return false;
	}
	
	public double similaridade(Palavra p) {
		double nivel = 0;
		int valor = 0;
		if(this.equals(p))
			nivel = 1;
		else {
			if(!this.contemNaSimilaridade(p))
				nivel = 0;
			else if(this.contemNaSimilaridade(p)) {
				nivel += 0.5;
				for(int i = 0; i < this.similares.length; i++)
					for(int j = 0; i < p.similares.length; j++)
						if(this.similares[i].equals(p.similares[j]))
							valor++;
				nivel = nivel + (valor / (valor*2));
			}
		}
		return nivel;
	}
}
