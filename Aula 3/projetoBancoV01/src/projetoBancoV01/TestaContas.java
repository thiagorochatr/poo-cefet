package projetoBancoV01;

public class TestaContas {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		
		conta1.titular = "Elton Charles";
		conta1.numero = 123;
		conta1.saldo = 3000;
		
		conta2.titular = "Coxinha";
		conta2.numero = 456;
		conta2.saldo = 4000;
		
		conta3.titular = "Vitorino";
		conta3.numero = 789;
		conta3.saldo = 2500;
		
		System.out.println("Titular: " + conta1.titular);
		System.out.println("Numero: " + conta1.numero);
		System.out.println("Saldo: " + conta1.saldo);
		System.out.println("\n");
		System.out.println("Titular: " + conta2.titular);
		System.out.println("Numero: " + conta2.numero);
		System.out.println("Saldo: " + conta2.saldo);
		System.out.println("\n");
		System.out.println("Titular: " + conta3.titular);
		System.out.println("Numero: " + conta3.numero);
		System.out.println("Saldo: " + conta3.saldo);
		System.out.println(conta1);
	}
}