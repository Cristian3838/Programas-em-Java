package segundoPrograma;
import javax.swing.JOptionPane;

public class quintoPrograma {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		double a;  double b; double c; double d; double e; double f;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		//Porcessamento de dados
		
		c= a+b;
		d= a*b;
		e = a/b;
		f= a-b;
		
		JOptionPane.showMessageDialog(null, "O Resultado da operação aritimética (Soma) do primeiro com segundo valor digitado é: " + c);
		JOptionPane.showMessageDialog(null, "O Resultado da operação aritimética (Multiplicação) do primeiro com segundo valor digitado é: " + d);
		JOptionPane.showMessageDialog(null, "O Resultado da operação aritimética (Divisão) do primeiro com segundo valor digitado é: " + e);
		JOptionPane.showMessageDialog(null, "O Resultado da operação aritimética (Subtração) do primeiro com segundo valor digitado é: " + f);
		JOptionPane.showMessageDialog(null, "Fim do Programa");
	}

}
