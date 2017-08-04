package classificacao.logica;

import java.util.Arrays;
import java.util.Iterator;

public class run {

	public static void main(String[] args) {
		Palavra p1 = new Palavra("casa");
		Palavra p3 = new Palavra("home");
		p1.setSimilares(p3);
		Palavra p5 = new Palavra("humano");
		p1.setSimilares(p5);
		Palavra p7 = new Palavra("teste");
		p1.setSimilares(p7);
		
		Palavra p2 = new Palavra("carro", p1);
		
		
		Palavra p4 = new Palavra("car");
		Palavra p8 = new Palavra("teste");
				
		p2.setSimilares(p7);
		p2.setSimilares(p4);
		
		System.out.println(p2.getSimilares().length);
		for (int i = 0; i < p2.getSimilares().length; i++) {
			System.out.println(p2.getSimilares()[i].getPalavra());
		}
		System.out.println(p2.similaridade(p1));
		//System.out.println(p7.similaridade(p8));
		
	}

}
