package br.com.fiap.www.Banco;



public class App  {

	public static void main(String[] args) {
		
		App app = new App();
		

		try {
			app.init();
		} catch (DepositaException e) {
			System.out.println("Valor Digitado Para deposito e Negativo!");
			e.printStackTrace();
		}catch (TransfereException e) {
			System.out.println("Valor Digitado Para transferir e Negativo!");
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		Conta conta1 = new Conta("00123-5");
		Conta conta2 = new Conta("0023-5");
		conta1.depositar(35);
		conta2.depositar(20);
		conta1.sacar(5);
		
		conta1.transfere(conta2, 20);

		ContaPoupanca poupanca = new ContaPoupanca("00321-5");
		poupanca.depositar(200);
		poupanca.sacar(100);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	

}

	private void init() {
		
	}
}
