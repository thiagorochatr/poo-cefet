
public class Conta {
	// Atributos
	private Cliente titular;// = new Cliente();
	private int numero;
	private double saldo;// = 500;
	
	public Conta(int numero) {
		this.titular = new Cliente();
		this.saldo = 500;
		//System.out.println("Estou instanciando uma conta...");
		if(this.validaNumero(numero)==false) {
			System.out.println("Uma conta deve ser criada com um núemro positivo");
			System.exit(0);
		}else {
			//atributo = argumento
			this.numero = numero;
		}
	}
	
	public Conta(int numero, String nomeDoTitular) {
		//Tem que ser a 1ª linha
		this(numero);//invocando Conta(numero) 
		this.getTitular().setNome(nomeDoTitular);
	}
	
	//getters and setters
	public Cliente getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	/* PRINCÍPIO DA IMUTABILIDADE!!!
	 * public void setNumero(int numero) { if(this.validaNumero(numero)==false) {
	 * System.out.println("Uma conta deve ser criada com um núemro positivo");
	 * System.exit(0); }else { //atributo = argumento this.numero = numero; } }
	 */
	
	//métodos encapsulados
	private boolean validaNumero(int numero) {
		if(numero<1) {
			System.out.println("Uma conta deve ser criada com um núemro positivo");
			return false;
		}else {
			return true;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	// Comportamentos
	public boolean saca(double valor) {
		if (valor > this.saldo || valor<=0) {
			return false;// Early return
		} else{
			// this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		}
	}

	public boolean deposita(double valor) {
		if (valor <= 0) {
			return false;// Early return
		} else {
			this.saldo = this.saldo + valor;
			return true;
		}
	}
	
	/*public boolean transfere(double valor,Conta contaDestino) {
		Conta contaOrigem=this;
		boolean transferenciaOk=false;
		if(valor>contaOrigem.saldo)
			transferenciaOk=false;
		else {
			if(valor>0) {
				contaOrigem.saldo-=valor;
				contaDestino.saldo+=valor;
				transferenciaOk= true;	
			}
		}
		return transferenciaOk;
	}*/
	
	public boolean transferePara(Conta contaDestino, double valor) {
		//this = conta1 = xpto = contaOrigem
		if(this.saca(valor)==true)
			return contaDestino.deposita(valor);
		else
			return false;
	}
}
