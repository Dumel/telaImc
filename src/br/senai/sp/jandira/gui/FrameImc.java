package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameImc {

   public String titulo;
   public int largura;
   public int altura;
   public Color corDoTextoDoBotao;
   public Color corDaCaixa;
   public Color corDaCaixa2;
  
   
   public void criarTela() {
	   
	   JFrame tela = new JFrame();
	   
	   tela.setTitle(titulo);
	   tela.setSize(largura, altura);
	   tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   tela.setLayout(null);
	   tela.getContentPane().setBackground(Color.BLACK);
	   
	   //Obter instância do container da janela
	   Container painel = tela.getContentPane();
	   
	  JButton buttonCalcularImc = new JButton();
	  buttonCalcularImc.setText("Calcular");
	  buttonCalcularImc.setBounds(250, 320, 100, 30);
	  buttonCalcularImc.setForeground(corDoTextoDoBotao);
	  
	  
	  
	  JLabel labelImc = new JLabel();
	  labelImc.setText("IMC");
	  labelImc.setBounds(30, 10, 100, 30);
	  labelImc.setForeground(Color.WHITE);
	  labelImc.setFont(new Font("impact", 30, 30));
	  
	  
	  JLabel labelNome = new JLabel();
	  labelNome.setText("Nome:");
	  labelNome.setBounds(30, 50, 100, 30);
	  labelNome.setForeground(Color.GREEN);
	  labelNome.setFont(new Font("Constantia", 15, 15));
	  
	  
	  JTextField textNome = new JTextField();
	  textNome.setBounds(30, 80, 200, 30);
	  textNome.setBackground(corDaCaixa);
	  
	  JLabel labelPeso = new JLabel();
	  labelPeso.setText("Peso:");
	  labelPeso.setBounds(30, 120, 300, 30);
	  labelPeso.setForeground(Color.GREEN);
	  labelPeso.setFont(new Font("Constantia", 15, 15));
	  
	  JTextField textPeso = new JTextField();
	  textPeso.setBounds(30, 160, 200, 30);
	  textPeso.setBackground(corDaCaixa2);
	  
	  JLabel labelAltura = new JLabel();
	  labelAltura.setText("Altura:");
	  labelAltura.setBounds(30, 200, 200, 30);
	  labelAltura.setForeground(Color.GREEN);
	  labelAltura.setFont(new Font("Constantia", 15, 15));
	  
	  JTextField textAltura = new JTextField();
	  textAltura.setBounds(30, 240, 200, 30);
	  textAltura.setBackground(corDaCaixa);
	  
	  JLabel labelDataDeNascimento = new JLabel();
	  labelDataDeNascimento.setText("Data de nasc:");
	  labelDataDeNascimento.setBounds(30, 280, 200, 30);
	  labelDataDeNascimento.setForeground(Color.GREEN);
	  labelDataDeNascimento.setFont(new Font("Constantia", 15, 15));
	  
	  JTextField textDataDeNascimento = new JTextField();
	  textDataDeNascimento.setBounds(30, 320, 200, 30);
	  textDataDeNascimento.setBackground(corDaCaixa2);
	  
	  JLabel labelResultadoImc = new JLabel();
	  labelResultadoImc.setText("Seu IMC é xxxx");
	  labelResultadoImc.setBounds(30, 380, 230, 30);
	  labelResultadoImc.setForeground(Color.RED);
	  labelResultadoImc.setFont(new Font("Constantia", 15, 15));
	  
	  JLabel labelStatusImc = new JLabel();
	  labelStatusImc.setText("Você está xxxx");
	  labelStatusImc.setBounds(30, 450, 230, 30);
	  labelStatusImc.setForeground(Color.RED);
	  labelStatusImc.setFont(new Font("Constantia", 15, 15));
	  
	  
	  //Eventos de clik
	  buttonCalcularImc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Cliente cliente = new Cliente();
			cliente.nome = textNome.getText();
			cliente.peso = Double.parseDouble(textPeso.getText());
			cliente.altura = Double.parseDouble(textAltura.getText());
			
			labelResultadoImc.setText(cliente.nome +  ", Seu IMC é " + cliente.getImc());
			labelStatusImc.setText("Status IMC: " + cliente.getStatus() );
			
				
			}
		});
	  
	  textNome.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "Aqui você não vai digitar nada");
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	  
	  
	  
	  
	  
	  //Adicionar o botão ao painel
	  painel.add(buttonCalcularImc);
	  painel.add(labelImc);
	  painel.add(labelNome);
	  painel.add(textNome);
	  painel.add(labelPeso);
	  painel.add(textPeso);
	  painel.add(labelAltura);
	  painel.add(textAltura);
	  painel.add(labelDataDeNascimento);
	  painel.add(textDataDeNascimento);
	  painel.add(labelResultadoImc);
	  painel.add(labelStatusImc);
	  
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  tela.setVisible(true);
	   
	   
   }
	
}
