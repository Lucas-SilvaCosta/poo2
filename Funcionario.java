public class Funcionario{
	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public Funcionario(){
		this.nome = "Lucas";
		this.cpf = "112221121";
		this.salario = 2589.63;
	}

	public void exibeDados(){
		System.out.println("Nome: "+this.nome+"\nCPF: "+this.cpf+"\nsalario: R$"+this.salario);
	}

	public String getNome(){
		return this.nome;
	}

}