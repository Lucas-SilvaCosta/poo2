public class Gerente extends Funcionario{
	private int senha;
	private int nFuncionariosGerenciados;

	public Gerente(String nome, String cpf, double salario, int senha, int n){
		super(nome, cpf, salario);
		this.senha = senha;
		this.nFuncionariosGerenciados = n;
	}

	public boolean autentica(int senha){
		return (this.senha == senha);
	}

}