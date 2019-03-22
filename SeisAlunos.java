public class SeisAlunos{
	int[][] a;

	public SeisAlunos(){
		a = new a[6][2];
	}

	public void setA(int[6][2] a){
		this.a = a;
	}
	
	public double mediaTodos(){
		int soma = 0;
		for(int i=0; i<6; i++){
			for(int j=0; j<2; j++){
				soma = soma+a[i][j];
			}	
		}
		return soma/12;
	}

	public static double media(int a, int b){
		return (a+b)/2;
	}

	public double mediaAluno(int numAluno){
		return media(a[numAluno][0], a[numAluno][1]);
	}

	public static String status(int numAluno){
		if(media(a[numAluno][0]+a[numAluno][1])>=6){
			return "aprovado";
		}else if(media(a[numAluno][0]+a[numAluno][1])<3){
			return "reprovado";
		}else{
			return "rec";
		}
	}

	public void totalAprovados(){
		int total = 0;
		for(int i=0; i<6; i++){
			if(status(i) == "aprovado"){total++}
		}
		System.out.println(total);
	}

	public void totalReprovados(){
		int total = 0;
		for(int i=0; i<6; i++){
			if(status(i) == "reprovado"){total++}
		}
		System.out.println(total);
	}

	public void totalRec(){
		int total = 0;
		for(int i=0; i<6; i++){
			if(status(i) == "rec"){total++}
		}
		System.out.println(total);
	}
}