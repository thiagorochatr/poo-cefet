import java.util.Arrays;

public class Empresa {
	private String nome,cnpj; //ge e set
	private Funcionario[] empregados; //get
	private int posicaoLivre; //nenhum
	
	public Empresa(int totalDeEmpregados) {
		this.empregados = new Funcionario[totalDeEmpregados];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}
	
	//método encapsulado
	private void aumentarArray() {
		/*Funcionario[] novoArray = new Funcionario[this.empregados.length+1];
		for (int i = 0; i < this.empregados.length; i++) {
			novoArray[i]=this.empregados[i];
		}
		this.empregados = novoArray;*/
		this.empregados = Arrays.copyOf(this.empregados, this.empregados.length+1);
	}
	
	//8
	public void remove(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if(this.empregados[i]==f) {
				this.empregados[i]=null;
				this.reorganizaArray();
			}
		}
	}
	
	private void reorganizaArray() {
		Funcionario[] novoArray = new Funcionario[this.empregados.length];
		for (int i =0,j = 0; i < this.empregados.length; i++) {
			if(this.empregados[i]!=null) {
				novoArray[j]=this.empregados[i];
				j++;
			}else
				this.posicaoLivre--;//2
		}
	}

	public void adiciona(Funcionario f) {
		if(this.empregados.length==this.posicaoLivre)
			this.aumentarArray();
		this.empregados[this.posicaoLivre] = f;
		//incremento a posição livre
		this.posicaoLivre++;
	}
	//4 e 5
	public void mostraEmpregados() {
		for (Funcionario func : this.empregados) {
			if(func!=null) {
				System.out.println("------------------------------");
				func.mostra();
			}
		}
	}
	//6
	public boolean estaNaEmpresa(Funcionario funcionarioProcurado) {
		Funcionario funcionarioCorrente = null;
		for (int i = 0; i < this.empregados.length; i++) {
			funcionarioCorrente = this.empregados[i];
			if(funcionarioProcurado==funcionarioCorrente) {
				//encontrei. Vou sair do método
				return true;
			}
		}//fim do for. Se cheguei aqui é pq não encontrei, logo...		
		return false;
	}
	
	
}
