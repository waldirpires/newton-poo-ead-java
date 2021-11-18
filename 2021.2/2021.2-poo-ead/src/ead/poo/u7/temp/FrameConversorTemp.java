package ead.poo.u7.temp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameConversorTemp {
	
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // entrada
        // rotulo
        JLabel rotulo = new JLabel("Temperatura em Celsius:");
        // caixa de texto
        JTextField campoTemp = new JTextField(10);
        
        // botao
        JButton botao = new JButton("Calcular em Fahrenheit");

        // resposta
        JTextField resposta = new JTextField("Resultado em Fahrenheit");
        resposta.setEditable(false);

        // colocando os componentes na tela
        frame.getContentPane().add(new JPanel(), BorderLayout.NORTH);
        frame.getContentPane().add(rotulo, BorderLayout.WEST);
        frame.getContentPane().add(campoTemp, BorderLayout.CENTER);
        frame.getContentPane().add(botao, BorderLayout.EAST);
        frame.getContentPane().add(resposta, BorderLayout.SOUTH);

        botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botao clicado!!!");			
				// converter de string para numero real
				var temp = Float.parseFloat(campoTemp.getText());
				// calcular
				var f = (temp * 9 / 5) + 32.0f;
				System.out.println(temp + " celsius = " + f + " fahrenheit");
				// exibir o resultado na tela
				resposta.setText("Resposta: " + f + " Fahrenheit");
			}
		});

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
