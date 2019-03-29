public class Imovel{
	private String endereco;
	private double preco;

	public Imovel(Strin end, double preco){
		this.endereco = end;
		this.preco = preco;
	}
	public Imovel(){
		this.endereco = "R.rua, 69";
		this.preco = 14563.89;
	}

	public double getPreco(){
		return this.preco;
	}
}