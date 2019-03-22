import java.util.Scanner;
import java.io.IOException;

public class Exercicios{
	
	public static void fibonacci(){
		int f1= 0;
		int f2 = 1;
		System.out.print(f1+", "+f2+", ");
		for(int i=1; i<8; i++){
			int temp = f2;
			f2 = f1+f2;
			f1 = temp;
			System.out.print(i<6 ? (f2+", ") : f2);
		}
	}

	public static void main(String args[]) throws IOException, InterruptedException{
		Scanner input = new Scanner(System.in);
		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		//int n = s.nextInt();
		//fibonacci();
		//System.out.print("cls");
		int[][] a = new int[6][2];
		/*for(int i=0; i<6; i++){
			for(int j=0; j<2; j++){
				System.out.print((j+1)+"ª nota do aluno "+(i+1)+": ");
				a[i][j] = input.nextInt();
			}	
		}*/
		String sel = "1";
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		while(sel.equals("6") || sel.equals("5") || sel.equals("4") ||
			  sel.equals("3") || sel.equals("2") || sel.equals("1")){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("oq deseja saber? digite:");
			System.out.println("    1- para saber a media de algum aluno");
			System.out.println("    2- para saber a situação de algum aluno");
			System.out.println("    3- para saber o total de alunos aprovados");
			System.out.println("    4- para saber o total de alunos reaprovados");
			System.out.println("    5- para saber o total de alunos em rec");
			System.out.println("    6- para saber a media da classe");
			System.out.println("\ndigite outra coisa para sair");
			sel = input.next();
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
	}
}