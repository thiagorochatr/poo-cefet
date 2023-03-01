import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
        Scanner in = new Scanner(System.in);
 
        String nome = in.nextLine();
        pessoa1.nome = nome;
        System.out.println(nome);
	}
}
