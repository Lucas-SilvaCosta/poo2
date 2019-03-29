public class Novo extends Imovel{
	private double precoAdc;

	public Novo(double p){
		super();
		this.precoAdc = p;
	}

	public void imprimeValorAdc(){
		System.out.println("Preco adicional: R$"+this.precoAdc);
	}
	public void setPrecoAdc(double newP){
		this.precoAdc = newP;
	}
}