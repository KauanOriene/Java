package br.com.fiap.www.Jogo2;

public abstract class Jogador {
	
	private String nome;
	private int direcao;
	private int x;
	private int y;
	
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void mover(int x, int y) {
		
		if (direcao == 0) {
			y = y  - 10;
			

		}
		if (direcao == 90) {
			x = x + 10;
			

		}	
		if (direcao == 180) {
			y = y  + 10;
	

		}
		if (direcao == 270) {
			x = x - 10;
	

		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		this.direcao = direcao;
	}
	
	

}