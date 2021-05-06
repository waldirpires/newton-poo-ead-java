package u7.celsius;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemp extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        var conversor = new ConversorTemp();

        // configurar tela
        conversor.setSize(500, 300);
        var layout = new FlowLayout();
        conversor.setLayout(layout);

        var labelEntrada = new JLabel("Temperatura: ");
        var entrada = new JTextField();
        entrada.setColumns(10);
        var painelEntrada = new JPanel();
        painelEntrada.add(labelEntrada);
        painelEntrada.add(entrada);

        conversor.add(painelEntrada);

        var labelTipo = new JLabel("Operação: ");
        var btnCelsiusToFah = new JButton("Celsius to Fahrenheit");

        var btnFahToCelsius = new JButton("Fahrenheit to Celsius");
        var painelOp = new JPanel(new FlowLayout());
        painelOp.add(labelTipo);
        painelOp.add(btnCelsiusToFah);
        painelOp.add(btnFahToCelsius);

        conversor.add(painelOp);

        var resp = new JTextArea(10, 10);
        conversor.add(resp);

        // tratando evento do botão C -> F
        btnCelsiusToFah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // f = c * 9/5 + 32
                var c = Double.parseDouble(entrada.getText());
                var f = c * 9 / 5 + 32;
                resp.setText("Resposta: " + f + " Fahrenheit");
            }
        });

        // tratando evento do botão F -> C
        btnFahToCelsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // c = (f - 32) * 5/9
                var f = Double.parseDouble(entrada.getText());
                var c = (f - 32) * 5 / 9;
                resp.setText("Resposta: " + f + " Celsius");
            }
        });

        // conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // conversor.pack();
        conversor.setVisible(true);

    }

}
