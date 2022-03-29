import javax.swing.JOptionPane;

public class DesafioBarTest {

	public static void main(String[] args) {
		
		
		String genero = JOptionPane.showInputDialog("Informe o Genero:");
		double qtCerveja = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de cervjeja: "));
		double qtRefrigerante = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Refrigerante: "));
		double qtREspetinhos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Espetinhos: "));
		
		Bar bar = new Bar(qtREspetinhos, qtREspetinhos, qtCerveja, qtRefrigerante, qtREspetinhos, qtREspetinhos);
		
		
		System.out.println(bar.valorGastoHomem());
		System.out.println(bar.valorGastoMulher());
	}

}
