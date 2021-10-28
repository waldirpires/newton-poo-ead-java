package u7.conversormoedas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import u7.celsius.ConversorTemp;

public class ConversorMoedas extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        var conversor = new ConversorMoedas();

        // configurar tela
        conversor.setSize(500, 300);
        var layout = new FlowLayout();
        conversor.setLayout(layout);

        var labelEntrada = new JLabel("Valor para conversão: ");
        var entrada = new JTextField();
        entrada.setColumns(10);
        var painelEntrada = new JPanel();
        painelEntrada.add(labelEntrada);
        painelEntrada.add(entrada);

        conversor.add(painelEntrada);

        var labelEntrada2 = new JLabel("Fator de conversão: ");
        var entrada2 = new JTextField();
        entrada2.setColumns(10);
        var painelEntrada2 = new JPanel();
        painelEntrada2.add(labelEntrada2);
        painelEntrada2.add(entrada2);

        conversor.add(painelEntrada2);

        var btnCalcular = new JButton("Converter");

        conversor.add(btnCalcular);

        var resp = new JTextArea(20, 50);
        conversor.add(resp);

        // tratando evento do botão C -> F
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // f = c * 9/5 + 32
                var v = Double.parseDouble(entrada.getText());
                var f = Double.parseDouble(entrada2.getText());
                var r = v * f;
                resp.setText("Resposta: " + r);
            }
        });

        // conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // conversor.pack();
        conversor.setVisible(true);

    }


}
