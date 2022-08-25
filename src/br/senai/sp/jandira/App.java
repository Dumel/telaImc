package br.senai.sp.jandira;

import java.awt.Color;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameImc;
import br.senai.sp.jandira.model.Cliente;

public class App {
	
	public static void main(String[] args) {
		
		FrameImc tela = new FrameImc();
		tela.titulo = "Calculadora de IMC";
		tela.largura = 400;
		tela.altura = 600;
		tela.corDoTextoDoBotao = new Color(139, 0, 139);
		tela.corDaCaixa = new Color(0, 255, 255);
		tela.corDaCaixa2 = new Color(0, 255, 127);
		tela.criarTela();
		
		
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		
		System.out.println(ana);
		System.out.println(pedro);
		
		
		
		
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 20);
		ana.peso = 58;
		ana.altura = 1.67;
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2000, 2, 16);
		pedro.peso = 70;
		pedro.altura = 1.70;
		
		System.out.println(ana.getImc());
		System.out.println();
		System.out.println(ana.getStatus());
		System.out.println();
		System.out.println(pedro.getImc());
		
		
	}

}
