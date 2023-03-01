
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario umFuncionario = new Funcionario("Júlio","vendas",5000);
		umFuncionario.getDataDenascimento().setDia("09");
		umFuncionario.getDataDenascimento().setMes("12");
		umFuncionario.getDataDenascimento().setAno("2003");	
		umFuncionario.demite();
		
		Funcionario outroFuncionario = new Funcionario("João","rh",4000);
		outroFuncionario.getDataDenascimento().setDia("07");
		outroFuncionario.getDataDenascimento().setMes("10");
		outroFuncionario.getDataDenascimento().setAno("2001");
		
		empresa.adiciona(umFuncionario);
		empresa.adiciona(outroFuncionario);
		
		if(empresa.estaNaEmpresa(umFuncionario)==true)
			System.out.println(umFuncionario.getNome()+" está na empresa!");
		else
			System.out.println(umFuncionario.getNome()+" NÃO está na empresa!");
		
		Funcionario f3 = new Funcionario("Joana","rh",4500);
		f3.getDataDenascimento().setDia("06");
		f3.getDataDenascimento().setMes("11");
		f3.getDataDenascimento().setAno("1984");
		
		empresa.adiciona(f3);
		empresa.mostraEmpregados();
		System.out.println("Vou remover "+outroFuncionario.getNome());
		empresa.remove(outroFuncionario);
		empresa.mostraEmpregados();	
	}

}
