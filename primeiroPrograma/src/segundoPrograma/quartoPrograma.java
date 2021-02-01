package segundoPrograma;

import javax.swing.JOptionPane;

public class quartoPrograma {

	public static void main(String[] args) {
		
		double  vendas_janeiro; 
		double  vendas_fevereiro; 
		double  vendas_marco; 
		double  faturamento;
		
		
	    vendas_janeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do faturamento de Janeiro: "));
		vendas_fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do faturamento de Fevereiro: "));
		vendas_marco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do faturamento de Março: "));
		//Interger.parseInt(); converte o valor digitado numérico que esta comoString em numérico novamente.
		
		faturamento = vendas_janeiro+vendas_fevereiro+vendas_marco;
		
		JOptionPane.showMessageDialog(null, "O Faturamento trimestral da empresa é: " + faturamento +" reais");
	}
          
}

