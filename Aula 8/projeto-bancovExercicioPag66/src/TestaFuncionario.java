
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario("Júlio","vendas",5000);
		umFuncionario.getDataDenascimento().setDia("09");
		umFuncionario.getDataDenascimento().setMes("12");
		umFuncionario.getDataDenascimento().setAno("2003");
		umFuncionario.setCpf("11111111111");
		
		umFuncionario.demite();
		
		System.out.println("Nome: "+umFuncionario.getNome());
		System.out.println("Departamento: "+umFuncionario.getDepartamento());
		System.out.println("Salário: "+umFuncionario.getSalario());
		System.out.println("Situação: "+((umFuncionario.isAtivo()==true)?"está na empresa"
				:"Não está mais na empresa"));
		System.out.println("Data de Nascimento: "+umFuncionario.getDataDenascimento().getDataBr());
		System.out.println("Identificador: "+umFuncionario.identificador);
		System.out.println("CPF: "+umFuncionario.cpf);
		
		Funcionario outroFuncionario = new Funcionario("João","rh",4000);
		outroFuncionario.getDataDenascimento().setDia("07");
		outroFuncionario.getDataDenascimento().setMes("10");
		outroFuncionario.getDataDenascimento().setAno("2001");
		outroFuncionario.setCpf("22222222222");
		
		outroFuncionario.mostra();
		
		System.out.println();
		System.out.println("Vou aumentar o salário");
		outroFuncionario.aumentarSalario(20);
		System.out.println("Depois do aumento, o salário ficou em R$"+outroFuncionario.getSalario());
	}
}
