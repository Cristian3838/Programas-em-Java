package segundoPrograma;
import javax.swing.JOptionPane;

public class quintoPrograma {

	public static void main(String[] args) {
		
		//Declara��o de vari�veis
		double a;  double b; double c; double d; double e; double f;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		//Porcessamento de dados
		
		c= a+b;
		d= a*b;
		e = a/b;
		f= a-b;
		
		JOptionPane.showMessageDialog(null, "O Resultado da opera��o aritim�tica (Soma) do primeiro com segundo valor digitado �: " + c);
		JOptionPane.showMessageDialog(null, "O Resultado da opera��o aritim�tica (Multiplica��o) do primeiro com segundo valor digitado �: " + d);
		JOptionPane.showMessageDialog(null, "O Resultado da opera��o aritim�tica (Divis�o) do primeiro com segundo valor digitado �: " + e);
		JOptionPane.showMessageDialog(null, "O Resultado da opera��o aritim�tica (Subtra��o) do primeiro com segundo valor digitado �: " + f);
		JOptionPane.showMessageDialog(null, "Fim do Programa");
	}

}
