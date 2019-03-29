public class CamaroteInferior extends Vip{
	private String lugar;

	public CamaroteInferior(String lugar){
		super();
		this.lugar = lugar;
	}

	public String getLugar(){
		return this.lugar;
	}
	public void setLugar(String l){
		this.lugar = l;
	}

	public void imprimeValor(){
		System.out.println("Preco: R$"+super.getPreco());
	}
}