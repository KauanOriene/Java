package br.com.fiap.www.Jogo2;

public class Guerreiro extends Jogador {
	
	

	public Guerreiro(int x, int y) {
		super(x, y);
	}

	private int mp;

	@Override
	public void mover(int x, int y) {
		super.mover(x, y);
		System.out.println(x);
	}
	
	

}
