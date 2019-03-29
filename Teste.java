import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args){
		//Ingresso i = new Ingresso(55.00);
		//i.imprimeValor();
		//Vip v = new Vip(25.50);
		//v.imprimeValor();

		//////// 5

		Scanner input = new Scanner(System.in);
		System.out.println("Escolha seu ingresso\n     1- Normal\n     2- VIP");
		int ingresso = input.nextInt();
		Ingresso i;
		if(ingresso == 1){
			i = new Ingresso();
			System.out.println("Normal");
			i.imprimeValor();
		}else if(ingresso == 2){
			System.out.println("Escolha seu camarote\n     1- Superior\n     2- Inferior");
			ingresso = input.nextInt();
			if(ingresso == 1){
				i = new CamaroteSuperior("L26", 25.0);
				i.imprimeValor();
			}else if(ingresso == 2){
				i = new CamaroteInferior("L26");
				i.imprimeValor();
			}else{
				System.out.println("Valor invalido");
			}
		}else{
			System.out.println("Valor invalido");
		}
	}
}