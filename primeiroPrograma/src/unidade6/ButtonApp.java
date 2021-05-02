package unidade6;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class ButtonApp extends JFrame implements ActionListener, WindowListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UIManager.LookAndFeelInfo looks[];

	public static void main(String[] args) {
		
		ButtonApp frame = new ButtonApp(); // Cria o objeto ButtonApp
		frame.setTitle("Minha Primeira Aplica��o");// Descri��o da Aplica��o
		frame.setSize(350, 250); // Define o tamanho da caixa
		Container cont = frame.getContentPane(); // Cria��o do objeto Para a troca de mensagem
		cont.setLayout(new FlowLayout()); // Cria��o de objeto para a inser��o do Layout
		JButton bot�o = new JButton ("Cria��o do bot�o");// Cria��o de um objetochamado bot�o
		bot�o.addActionListener(frame); // Cria��o de um atributo passando com par�metro a Frame
		cont.add(bot�o);// Adicona o bot�o
		frame.addWindowListener(frame); // Cria��o de um atributo 
		
		//L&F
		
		frame.looks = UIManager.getInstalledLookAndFeels();
		frame.setVisible(true);
		
		
		
		try {
			
			
			UIManager.setLookAndFeel(frame.looks[2].getClassName());
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
