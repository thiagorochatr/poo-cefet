
public class TestaContas {

	public static void main(String[] args) {
		Conta umaConta = new Conta(1);//xpto
		
		//Cliente umCliente = new Cliente();
		//umCliente.nome="Vitorino";
		
		//umaConta.titular = umCliente;
		
		//umaConta.titular = new Cliente();
		//umaConta.setNumero(1); // Imutável
		umaConta.getTitular().setNome("Vitorino");
		umaConta.getTitular().setCpf("12345678910");
		umaConta.getTitular().setEmail("vitorino@aluno.cefet-rj.br");
		
		
		umaConta.deposita(3000);//3500
		umaConta.saca(500);//3000
		
		//umaConta.saldo = -20000;
		
		System.out.println("Número: "+umaConta.getNumero());
		System.out.println("Saldo: "+umaConta.getSaldo());
		System.out.println("Nome do titular: "+umaConta.getTitular().getNome());
		System.out.println("E-mail do titular: "+umaConta.getTitular().getEmail());
		System.out.println("Cpf do titular: "+umaConta.getTitular().getCpf());
		
		System.out.println();
		System.out.println("Outra conta\n\n");
		
		Conta outraConta = new Conta(2);
		outraConta.getTitular().setNome("Maria");
		System.out.println("Número: "+outraConta.getNumero());
		System.out.println("Saldo: "+outraConta.getSaldo());
		System.out.println("Nome do titular: "+outraConta.getTitular().getNome());
		System.out.println("E-mail do titular: "+outraConta.getTitular().getEmail());
		System.out.println("Cpf do titular: "+outraConta.getTitular().getCpf());
		
	

	}

}
