package br.com.fiap.www.Jogo2;

public class App {

	public static void main(String[] args) {
		
		var fase = new Fase();
		fase.carregar();
	
		var guerreiro = new Guerreiro(2, 6);
		guerreiro.setNome("Pedro");
		guerreiro.mover(2, 1);
		
		

	}

}
