package produtosimples;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n[] = new int[2];
		int x,prod;
		
		for(x=0;x<2;x++) {
		System.out.println("Digite o "+(x+1)+"º número inteiro:");
		n[x]= leia.nextInt();
		}
		
		prod = n[0]*n[1];
		System.out.println("Produto:"+prod);
	}

}
