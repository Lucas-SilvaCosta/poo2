public class Velha extends Imovel{
	private int desconto;

	public Velha(){
		super();
		this.desconto = 15;
	}

	public void imprimeDesconto(){
		System.out.println("Valor de desconto: R$"+(super.getPreco()*(this.desconto/100));
	}
	public void setDesconto(int newD){
		this.desconto = newD;
	}
}