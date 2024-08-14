package primeiraaula;

import java.util.Scanner;

public class segundaatividade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int quant1; 
		int quant2; 
		int quant3;
		int quant4; 
		int som;
		



		System.out.println("Informe a quantia de vendas na primeira semana: ");
		quant1 = ler.nextInt();
		System.out.println("Informe a quantia de vendas na segunda semana: ");
		quant2 = ler.nextInt();
		System.out.println("Informe a quantia de vendas na terceira semana: ");
		quant3 = ler.nextInt();
		System.out.println("Informe a quantia de vendas na quarta semana: ");
		quant4 = ler.nextInt();

		som = quant1+quant2+quant3+quant4;
		
		


		switch (som) {

		case 1:
			System.out.println("Não haverá bônus");
		break;
		
		case 2:
			System.out.println("Não haverá bônus");
		break;
		
		case 3:
			System.out.println("Não haverá bônus");
		break;
		
		case 4:
			System.out.println("Não haverá bônus");
		break;
		
		case 5:
			System.out.println("Não haverá bônus");
		break;
		
		case 6:
			System.out.println("Não haverá bônus");
		break;
		
		case 7:
			System.out.println("Não haverá bônus");
		break;
		
		case 8:
			System.out.println("Não haverá bônus");
		break;
		
		case 9:
			System.out.println("Não haverá bônus");
		break;
		
		case 10:
			System.out.println("Seu bôus será de R$100,00");
		break;
		
		case 11:
			System.out.println("Seu bôus será de R$100,00");
		break;
		
		case 12:
			System.out.println("Seu bôus será de R$100,00");
		break;
		
		case 13:
			System.out.println("Seu bôus será de R$100,00");
		break;
		
		case 14:
			System.out.println("Seu bôus será de R$100,00");
		break;
		
		case 15:
			System.out.println("Seu bônus será de R$300,00");
		break;
		
		case 16:
			System.out.println("Seu bônus será de R$300,00");
		break;
		
		case 17:
			System.out.println("Seu bônus será de R$300,00");
		break;
		
		case 18:
			System.out.println("Seu bônus será de R$300,00");
		break;
		
		case 19:
			System.out.println("Seu bônus será de R$300,00");
		break;
		
		case 20:
			System.out.println("Seu bônus será de R$500,00");
		break;
		
		
		}
		ler.close();
	}

}
