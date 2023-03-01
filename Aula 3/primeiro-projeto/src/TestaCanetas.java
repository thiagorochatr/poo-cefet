
public class TestaCanetas {
	public static void main(String[] args) {	
		Caneta caneta1 = new Caneta();
		caneta1.marca = "BIC";
		caneta1.cor = "Preta";
		caneta1.tamanho = 10;
		System.out.println(caneta1.cor);
		System.out.println(caneta1.marca);
		System.out.println(caneta1.tamanho);
		System.out.println("\n");
		Caneta caneta2 = new Caneta();
		caneta2.marca = "Pillot";
		caneta2.cor = "Azul";
		caneta2.tamanho = 15;
		caneta2.tampa = true;
		System.out.println(caneta2.cor);
		System.out.println(caneta2.marca);
		System.out.println(caneta2.tamanho);
		System.out.println("Tem tampa? "+ caneta2.tampa);
	}
}