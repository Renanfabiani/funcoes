import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max (a,b,c);
		
		showResult(higher);
		
		sc.close();
				
	}
	
	public static int max(int x, int y, int z){//int porque eu quero que retorne um numero inteiro e max poque � o nome da fun��o que colocamos acima
	
		int aux;//essa vari�vel � local, s� funciona nesse local que criamos
		if (x>y && x>z) {
			aux = x;
		}
		else if (y>z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult (int value){//essa fun��o simplesmente vai me retornar uma a��o do maior numero
		System.out.println("Higher = " + value);
		}
}
