
public class TestaReferencias2 {
	public static void main(String[] argumentos) {
		Conta[] contas = new Conta[2];
		
		Conta c1 = new Conta(1);
		contas[0] = c1;
		contas[0].deposita(4000);
		
		contas[1] = new Conta(2);
		contas[1].deposita(5000);
		
		System.out.println("Antes de 'redimensionar' o array");
		for (int i = 0; i < contas.length; i++) {
			if(contas[i]!=null) {
				System.out.print("Na posição "+i+" eu tenho a conta de número "+contas[i].getNumero());
				System.out.println(" possui R$"+contas[i].getSaldo()+" de saldo");
			}
		}
		
		System.out.println("Vou 'redimensionar' o array e adicionar uma conta");
		
		Conta[] contasNovo = new Conta[contas.length+1];
		for (int i = 0; i < contas.length; i++) { 
			contasNovo[i]=contas[i];
		}
		
		contas = contasNovo;
		contasNovo = null;
		contas[2] = new Conta(3); contas[2].deposita(1000);
		
		
		//Foreach
		for (Conta c : contas) {
			if(c!=null) {
				System.out.print("A conta de número "+c.getNumero());
				System.out.println(" possui R$"+c.getSaldo()+" de saldo");
			}
		}
		
		
		
	}
}
