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
		frame.setTitle("Minha Primeira Aplicação");// Descrição da Aplicação
		frame.setSize(350, 250); // Define o tamanho da caixa
		Container cont = frame.getContentPane(); // Criação do objeto Para a troca de mensagem
		cont.setLayout(new FlowLayout()); // Criação de objeto para a inserção do Layout
		JButton botão = new JButton ("Criação do botão");// Criação de um objetochamado botão
		botão.addActionListener(frame); // Criação de um atributo passando com parâmetro a Frame
		cont.add(botão);// Adicona o botão
		frame.addWindowListener(frame); // Criação de um atributo 
		
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
