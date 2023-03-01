
public class TestaArrayReferencias {
	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		
		Conta c1 = new Conta(1);
		contas[2] = c1;
		contas[2].deposita(4000);
		/*System.out.println("A conta de número "+c1.getNumero()+" tem R$"+c1.getSaldo());//4500
		c1.saca(2500);
		System.out.println("A conta de número "+c1.getNumero()+" tem R$"+c1.getSaldo());//2000*/
		
		contas[4] = new Conta(2);
		contas[4].deposita(5000);
		
		for (int i = 0; i < contas.length; i++) {
			if(contas[i]!=null) {
				System.out.print("Na posição "+i+" eu tenho a conta de número "+contas[i].getNumero());
				System.out.println(" possui R$"+contas[i].getSaldo()+" de saldo");
			}else
				System.out.println("Não há nenhuma conta referenciada pela posição "+i+".");	
		}
		
	}
}
