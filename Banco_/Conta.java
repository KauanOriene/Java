package br.com.fiap.www.Banco;

public class Conta extends Object  { 
	
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor)throws DepositaException {
		saldo += valor;
		if (valor < 0)
			throw new DepositaException("Valor Digitado Para deposito e Negativo!");
	}
	
	public void sacar(double valor) {
		saldo -= valor;
		
	
	}
	

	
	public void transfere (Conta conta2, double valor) throws TransfereException {
		
		if (valor < 0)
			throw new TransfereException("Valor Digitado Para Transferir e Negativo!");
		
		if (valor <= 0) {
            System.out.println("O valor da transferência deve ser maior que zero.");
            return;
        }

        if (saldo < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }
        
		saldo -= valor;
        conta2.saldo += valor;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	

	
}