package br.com.fiap.www.Banco;


public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero) {
		super(numero);
	}

	private double taxa;

	public double getTaxa() {
		return taxa;
	}
	
	

}