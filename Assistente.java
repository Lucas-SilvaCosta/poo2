public class Assistente extends Funcionario{
	private int nMatricula;

	public Assistente(int n){
		super();
		this.nMatricula = n;
	}
	public Assistente(){
		super();
		this.nMatricula = 18200432;
	}

	public int getMatricula(){
		return this.nMatricula;
	}
	public void setMatricula(int newN){
		this.nMatricula = newN;
	}

	@Override
	public void exibeDados(){
		//super.exibeDados();
		System.out.println("Nome: "+super.getNome()+"\nNumero de Matricula: "+this.nMatricula);
	}
}