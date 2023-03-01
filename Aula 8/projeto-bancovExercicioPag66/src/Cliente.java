
public class Cliente {
//atributos
	private String nome;
	private String cpf;
	private String email;
//Comportamento
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		//A regra já está no set
		this.setNome(nome);
	}

	/*
	 * public Cliente(String email) { this.email = email; }
	 */
	
	public Cliente(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}
	
	//métodos encapsulados
	private boolean validaCpf(String cpf) {
		if(cpf.length()==11)
			return true;
		return false;
	}
	
	/*
	 * private boolean validaNome(String nome) { if(nome.length()<10) return false;
	 * return true; }
	 */

	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.length()<6) {
			System.out.println("Nome precisa ter ao menos 6 caracteres.");
			System.exit(0);
		}else {
			this.nome = nome;
		}
		
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(this.validaCpf(cpf)==true)
			this.cpf = cpf;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
