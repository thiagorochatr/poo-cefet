
public class Funcionario {
	String nome, departamento;
	double salario;
	boolean ativo;
	Data dataDenascimento;
	int identificador;
	static int contador;
	String cpf;
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	private boolean validaCpf(String cpf) {
		return (cpf.length() == 11);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(validaCpf(cpf))
		this.cpf = cpf;
	}
	
	public Funcionario() {
		//regra básica
		this.ativo = true;
		this.dataDenascimento = new Data();
		//this.nome = name;
		
		Funcionario.contador++;
		this.identificador = Funcionario.contador;
		
	}
	
	public void mostra() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Departamento: "+this.getDepartamento());
		System.out.println("Salário: "+this.getSalario());
		if(this.isAtivo()==true) 
			System.out.println("Situação: está na empresa");
		else
			System.out.println("Situação: não está mais na empresa");
		System.out.println("Data de Nascimento: "+this.getDataDenascimento().getDataBr());
		System.out.println("Identificador: "+this.identificador);
		System.out.println("CPF: "+this.cpf);
	}
	
	public Funcionario(String nome, String departamento, double salario) {
		//Invocando o construtor padrão
		this();
		this.setNome(nome);
		this.setDepartamento(departamento);
		this.setSalario(salario);
	}

	//comportamentos
	public void aumentarSalario(double percentualDeAumento) {
		this.salario = this.salario + ( (this.salario*percentualDeAumento)/100 );
	}
	
	public void demite() {
		this.ativo = false;
	}
	
	//getters and setters
	public Data getDataDenascimento() {
		return this.dataDenascimento;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
