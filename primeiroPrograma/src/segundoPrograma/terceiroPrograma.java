package segundoPrograma;

import javax.swing.JOptionPane;

public class terceiroPrograma {

	public static void main(String[] args) {
		
		int vendas_janeiro=15_000; int vendas_fevereiro = 23_000; int  vendas_marco= 17_000; int faturamento;
		
		faturamento = vendas_janeiro+vendas_fevereiro+vendas_marco;
		
		System.out.println("O Faturamento trimenstral da empresa é: " + faturamento+" reais");
		JOptionPane.showMessageDialog(null, "O Faturamento trimestral da empresa é: " + faturamento +" reais");
		JOptionPane.showInputDialog("Digite o valor do faturamento trimestral: ");
		
		
		
		
		
	}
          
}
