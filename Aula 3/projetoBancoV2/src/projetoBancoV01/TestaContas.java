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
		
		
		conta3 = conta2;
		conta3.titular = "william Brandão";
		conta3.saldo = 9000;
		conta2.numero = 8000;
		
		System.out.println("Titular: " + conta1.titular);
		System.out.println("Numero: " + conta1.numero);
		System.out.println("Saldo: " + conta1.saldo);
		System.out.println("##################");
		System.out.println("Titular: " + conta2.titular);
		System.out.println("Numero: " + conta2.numero);
		System.out.println("Saldo: " + conta2.saldo);
		System.out.println("##################");
		System.out.println("Titular: " + conta3.titular);
		System.out.println("Numero: " + conta3.numero);
		System.out.println("Saldo: " + conta3.saldo);
		System.out.println("##################");
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
	}
}