package segundoPrograma;
import javax.swing.JOptionPane;

public class sextoPrograma {

	public static void main(String[] args) {
		//Declara��o de vari�veis
		double a;  double b; double c; 
		
		// Processamento de dados
		
		JOptionPane.showMessageDialog(null, "Esta tendo uma festa, e ela � para maiores de 18 anos, se quiser ser liberado, digite sua idade a seguir!");
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
		if (a<18) {
			JOptionPane.showMessageDialog(null, "Voc� � menor de 18 anos, n�o � permitida a entrada!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Pode entrar, voc� � maior de 18 anos!");
			}
		
		
		
		JOptionPane.showMessageDialog(null, "Temos festa infantil tamb�m.");
		JOptionPane.showMessageDialog(null, "O Valor do ingresso para a festa infantil custa 10 reais ");
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu dinheiro: "));
		
		if (b>10) {
			JOptionPane.showMessageDialog(null, "Parab�ns, aproveite a festa!");
			}
			else {
				JOptionPane.showMessageDialog(null, "N�o � poss�vel a compra do ingresso!");
			}
		
		
		
		JOptionPane.showMessageDialog(null, "Precisamos passar o caminh�o pela balsa");
		c = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do caminh�o carregado ou n�o: "));
		if (c>=1000) {
			JOptionPane.showMessageDialog(null, "Peso acima da capacidade da balsa");
			}
			else {
				JOptionPane.showMessageDialog(null, "Pode entrar como caminh�o na balsa!");
			}
		
		
		
		

	}

}
