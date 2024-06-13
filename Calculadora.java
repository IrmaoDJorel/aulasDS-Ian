import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {
    private JFrame janela;
    private JTextField campo1, campo2, resultado;
    private JButton soma, subtrai, multiplica, divide;

    public Calculadora() {
        janela = new JFrame("Calculadora");
        janela.setSize(200, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);
        resultado = new JTextField(10);
        resultado.setEditable(false);

        soma = new JButton("+");
        subtrai = new JButton("-");
        multiplica = new JButton("*");
        divide = new JButton("/");

        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });

        subtrai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });

        multiplica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });

        janela.add(new JLabel("Número 1:"));
        janela.add(campo1);
        janela.add(new JLabel("Número 2:"));
        janela.add(campo2);
        janela.add(soma);
        janela.add(subtrai);
        janela.add(multiplica);
        janela.add(divide);
        janela.add(new JLabel("Resultado:"));
        janela.add(resultado);

        janela.setVisible(true);
    }

    private void calcular(String operacao) {
        try {
            double num1 = Double.parseDouble(campo1.getText());
            double num2 = Double.parseDouble(campo2.getText());
            double resultadoCalc;

            switch (operacao) {
                case "+":
                    resultadoCalc = num1 + num2;
                    break;
                case "-":
                    resultadoCalc = num1 - num2;
                    break;
                case "*":
                    resultadoCalc = num1 * num2;
                    break;
                case "/":
                    if (num2!= 0) {
                        resultadoCalc = num1 / num2;
                    } else {
                        resultadoCalc = 0;
                        JOptionPane.showMessageDialog(janela, "Erro: divisão por zero!");
                    }
                    break;
                default:
                    resultadoCalc = 0;
            }

            resultado.setText(String.valueOf(resultadoCalc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(janela, "Erro: entrada inválida!");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}