package br.com.cod3r.decorator.swing;

import java.awt.FlowLayout;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setLayout(new FlowLayout());

		JTextArea textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,200);
		
		//frame.add(textArea);
		frame.add(scrollPane);
		frame.setVisible(true);
	}
}
