import javax.swing.JOptionPane;

public class Bar {
	
	//Parametros
	
	private double ingrHomem = 10;
	private double ingrMulher = 8;
	private double cerveja = 0;
	private double refrigerante = 0;
	private double espetinho = 0;
	private double taxaCouvert = 4.0;
	public Sexo sexo;
	
	//Construtor
	public Bar (double ingrHomem, double ingrMulher, double cerveja, double refrigerante,
			double espetinho, double taxaCouvert ) {
		
		this.ingrHomem = (ingrHomem);
		this.ingrMulher = (ingrMulher);
		this.cerveja = (cerveja);
		this.refrigerante = (refrigerante);
		this.espetinho = (espetinho);
		this.taxaCouvert = (taxaCouvert);
	
		
		if (taxaCouvert <= 30) {
			System.out.println(" é Cobrado a Taxa de Couvert  de: R$: 4,00 ");
		}else {
			System.out.println(" Não é Cobrado a Taxa de Couvert");
		}
		
	}
	
	public double getIngrHomem() {
		return ingrHomem;
	}
	public void setIngrHomem(double ingrHomem) {
		this.ingrHomem = ingrHomem;
	}
	public double getIngrMulher() {
		return ingrMulher;
	}
	public void setIngrMulher(double ingrMulher) {
		this.ingrMulher = ingrMulher;
	}
	public double getCerveja() {
		return cerveja;
	}
	public void setCerveja(double cerveja) {
		this.cerveja = cerveja;
	}
	public double getRefrigerante() {
		return refrigerante;
	}
	public void setRefrigerante(double refrigerante) {
		this.refrigerante = refrigerante;
	}
	public double getEspetinho() {
		return espetinho;
	}
	public void setEspetinho(double espetinho) {
		this.espetinho = espetinho;
	}
	public double getTaxaCouvert() {
		return taxaCouvert;
	}
	public void setTaxaCouvert(double taxaCouvert) {
		this.taxaCouvert = taxaCouvert;
		
	}
	
	public String valorGastoHomem() {
	
		return "Genero: " + sexo.MASCULINO + 
			"\nValor do Ingresso: " + this.getIngrHomem() + 
			"\nQuantidade de Cerveja Consumida: " + this.getCerveja() + 
			"\nQuantidade de Refrigerante: " + this.getRefrigerante() + 
			"\nQuantidade de Espetinhos Consumidos: " + this.getEspetinho();
		

	}
	
	public String valorGastoMulher() {
		
		return "Genero: " + sexo.FEMININO + 
			"\nValor do Ingresso: " + this.getIngrMulher() + 
			"\nQuantidade de Cerveja Consumida: " + this.getCerveja() + 
			"\nQuantidade de Refrigerante: " + this.getRefrigerante() + 
			"\nQuantidade de Espetinhos Consumidos: " + this.getEspetinho();
	}
}
