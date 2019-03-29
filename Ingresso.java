public class Ingresso{
	private double preco;

	public Ingresso(double n){
		this.preco = n;
	}
	public Ingresso(){
		this.preco = 100.00;
	}

	public void imprimeValor(){
		System.out.println("Preço: R$"+this.preco);
	}

	public double getPreco(){
		return this.preco;
	}
}