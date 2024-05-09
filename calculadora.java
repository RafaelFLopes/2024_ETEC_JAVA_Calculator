import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculadora extends JFrame {

    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, dividir, multiplicar, subtrair, limpar, ocultar, aparecer;

    public calculadora() {
        super("Exemplo de soma");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("+");
        subtrair = new JButton("-");
        multiplicar = new JButton("x");
        dividir = new JButton("/");
        limpar = new JButton("Limpar");
        ocultar = new JButton("Ocultar");
        aparecer = new JButton("Aparecer");

        //Fazendo posicionamento dos elementos na tela
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 50, 100, 20);
        texto1.setBounds(120, 20, 217, 20);
        texto2.setBounds(120, 50, 217, 20);
        exibir.setBounds(50, 80, 200, 20);
        somar.setBounds(50, 110, 50, 20);
        subtrair.setBounds(50, 130, 50, 20);
        multiplicar.setBounds(100, 110, 50, 20);
        dividir.setBounds(100, 130, 50, 20);
        limpar.setBounds(163, 110, 174, 20);
        ocultar.setBounds(250, 130, 87, 20);
        aparecer.setBounds(163, 130, 87, 20);

        limpar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText(null);
                texto2.setText(null);
                exibir.setText(null);
                texto1.requestFocus();
            }
        }
        );
        ocultar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setVisible(false);
                texto2.setVisible(false);
            }
        }
        );
        aparecer.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto2.setVisible(true);
                texto1.setVisible(true);
            }
        }
        );
        somar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1, numero2, soma;
                soma = 0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                soma = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("A soma é: " + soma);
            }
        }
        );
        subtrair.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1, numero2, subtrair;
                subtrair = 0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                subtrair = numero1 - numero2;
                exibir.setVisible(true);
                exibir.setText("A subtração é: " + subtrair);
            }
        }
        );
        multiplicar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1, numero2, multiplicar;
                multiplicar = 0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                multiplicar = numero1 * numero2;
                exibir.setVisible(true);
                exibir.setText("A multiplicação é: " + multiplicar);
            }
        }
        );
        dividir.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1, numero2, dividir;
                dividir = 0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                dividir = numero1 / numero2;
                exibir.setVisible(true);
                exibir.setText("A divisão é: " + dividir);
            }
        }
        );

        exibir.setVisible(false);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);
        tela.add(limpar);
        tela.add(ocultar);
        tela.add(aparecer);
        setSize(405, 230);
        setVisible(true);
    }

    public static void main(String args[]) {
        calculadora app = new calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
