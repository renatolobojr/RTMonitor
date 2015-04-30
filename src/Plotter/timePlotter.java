package Plotter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dados.tela;

import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class timePlotter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1269141734158373129L;
	private tela t = new tela();
	private static int temp = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timePlotter frame = new timePlotter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public timePlotter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 553, 500); //(posição_X, posição_Y, Largura, Altura)
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MyCanvas canvas = new MyCanvas();
		canvas.setBounds(0, 0, 600, 400);
		contentPane.add(canvas);
		
		JButton btnNewButton = new JButton("descer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for(int j=0;j<25;j++) t.add(temp--);
				
				canvas.repaint();
			}
		});
		btnNewButton.setBounds(405, 407, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("subir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int j=0;j<25;j++) t.add(temp++);
				canvas.repaint();
			}
		});
		btnNewButton_1.setBounds(88, 407, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("manter");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int j=0;j<25;j++) t.add(temp);
				canvas.repaint();
			}
		});
		btnNewButton_2.setBounds(249, 407, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		
	}

	
	
	private class MyCanvas extends Canvas{
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 9080923919370473491L;

		@Override
		public void paint(Graphics g) {
	        // Draw Text
			final int i = 20;
			final int e = 30;
					
	        g.drawString("100%",5,i);
	        g.drawString(" 90%",5,i+e);
	        g.drawString(" 80%",5,i+(2*e));
	        g.drawString(" 70%",5,i+(3*e));
	        g.drawString(" 60%",5,i+4*e);
	        g.drawString(" 50%",5,i+5*e);
	        g.drawString(" 40%",5,i+6*e);
	        g.drawString(" 30%",5,i+7*e);
	        g.drawString(" 20%",5,i+8*e);
	        g.drawString(" 10%",5,i+9*e);
	        g.drawString(" 00%",5,i+10*e);

	        g.drawString("00", 33 , 335);
	        g.drawString("30", 33+2*e , 335);
	        g.drawString("60", 33+4*e , 335); 
	        g.drawString("90", 33+6*e , 335);
	        g.drawString("120", 29+8*e , 335); g.drawString("Segundos", 11+8*e , 350); 
	        g.drawString("150", 29+10*e , 335);
	        g.drawString("180", 29+12*e , 335); 
	        g.drawString("210", 29+14*e , 335);
	        g.drawString("240", 29+16*e , 335); 
	        
	        
	        g.setColor(Color.white);
	        g.fillRect(40,20,480,10*e);
	        g.setColor(Color.GRAY);
	        g.drawLine(40, i+e, 520, i+e);
	        g.drawLine(40, i+2*e, 520, i+2*e);
	        g.drawLine(40, i+3*e, 520, i+3*e);
	        g.drawLine(40, i+4*e, 520, i+4*e);
	        g.drawLine(40, i+5*e, 520, i+5*e);
	        g.drawLine(40, i+6*e, 520, i+6*e);
	        g.drawLine(40, i+7*e, 520, i+7*e);
	        g.drawLine(40, i+8*e, 520, i+8*e);
	        g.drawLine(40, i+9*e, 520, i+9*e);
	        
	        g.drawLine(70, i+10*e, 70, i);
	        g.drawLine(70+e, i+10*e, 70+e, i);
	        g.drawLine(70+2*e, i+10*e, 70+2*e, i);
	        g.drawLine(70+3*e, i+10*e, 70+3*e, i);
	        g.drawLine(70+4*e, i+10*e, 70+4*e, i);
	        g.drawLine(70+5*e, i+10*e, 70+5*e, i);
	        g.drawLine(70+6*e, i+10*e, 70+6*e, i);
	        g.drawLine(70+7*e, i+10*e, 70+7*e, i);
	        g.drawLine(70+8*e, i+10*e, 70+8*e, i);
	        g.drawLine(70+9*e, i+10*e, 70+9*e, i);
	        g.drawLine(70+10*e, i+10*e, 70+10*e, i);
	        g.drawLine(70+11*e, i+10*e, 70+11*e, i);
	        g.drawLine(70+12*e, i+10*e, 70+12*e, i);
	        g.drawLine(70+13*e, i+10*e, 70+13*e, i);
	        g.drawLine(70+14*e, i+10*e, 70+14*e, i);
	        
	        g.setColor(Color.blue);
	        for(int j=0;j<240;j++) g.drawOval(40+(j*2), 319 - t.visor[j], 1, 1);
	        		        
	        g.setColor(Color.black);
	        g.drawRect(40,20,480,10*e);
	    }		
		
	}
}


