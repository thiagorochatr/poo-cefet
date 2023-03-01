
public class TestaArray {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 30;
		
		//int[] numeros = {25, 30, 35, 40, 50};
		int[] numeros = new int[5];
		
		numeros[1]=25;
		numeros[4]=30;
		//numeros[5] = 50;//ArrayIndexOutOfBoundsException
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros[i]*10;
			System.out.println("Na posição "+i+" eu tenho o valor "+numeros[i]);
		}

	}

}
