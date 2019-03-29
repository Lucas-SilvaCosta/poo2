public class Vip extends Ingresso{
	private double precoAdc;

	public Vip(double precoAdc){
		super();
		this.precoAdc = precoAdc;
	}
	public Vip(){
		super();
		this.precoAdc = 125.00;
	}

	@Override
	public void imprimeValor(){
		System.out.println("Preço: R$"+(super.getPreco()+this.precoAdc));
	}

	@Override
	public double getPreco(){
		return (super.getPreco()+this.precoAdc);
	}
}