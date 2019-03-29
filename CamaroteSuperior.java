public class CamaroteSuperior extends Vip{
	private String lugar;
	private double precoAdc;

	public CamaroteSuperior(String lugar, double precoAdc){
		super();
		this.lugar = lugar;
		this.precoAdc = precoAdc;
	}

	@Override
	public void imprimeValor(){
		System.out.println("Preco: R$"+(super.getPreco()+this.precoAdc));
	}
}