package segundoPrograma;
import javax.swing.JOptionPane;

public class sextoPrograma {

	public static void main(String[] args) {
		//Declaração de variáveis
		double a;  double b; double c; 
		
		// Processamento de dados
		
		JOptionPane.showMessageDialog(null, "Esta tendo uma festa, e ela é para maiores de 18 anos, se quiser ser liberado, digite sua idade a seguir!");
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
		if (a<18) {
			JOptionPane.showMessageDialog(null, "Você é menor de 18 anos, não é permitida a entrada!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Pode entrar, você é maior de 18 anos!");
			}
		
		
		
		JOptionPane.showMessageDialog(null, "Temos festa infantil também.");
		JOptionPane.showMessageDialog(null, "O Valor do ingresso para a festa infantil custa 10 reais ");
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu dinheiro: "));
		
		if (b>10) {
			JOptionPane.showMessageDialog(null, "Parabéns, aproveite a festa!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Não é possível a compra do ingresso!");
			}
		
		
		
		JOptionPane.showMessageDialog(null, "Precisamos passar o caminhão pela balsa");
		c = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do caminhão carregado ou não: "));
		if (c>=1000) {
			JOptionPane.showMessageDialog(null, "Peso acima da capacidade da balsa");
			}
			else {
				JOptionPane.showMessageDialog(null, "Pode entrar como caminhão na balsa!");
			}
		
		
		
		

	}

}
