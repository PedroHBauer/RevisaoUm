import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    public JPanel panelMain;
    private JComboBox comboBox1;
    private JButton exibirButton;
    private JTextArea textArea1;

    public Form() {

        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (comboBox1.getSelectedIndex() == 1) {
                    String Explicacao = "Polimorfismo é a característica única de linguagens orientadas a objetos que permite que diferentes objetos respondam a mesma mensagem cada um a sua maneira. Em termos de programação, polimorfismo representa a capacidade de uma única referência invocar métodos diferentes, dependendo do seu conteúdo.";

                    textArea1.setText(Explicacao);

                }else if (comboBox1.getSelectedIndex() == 2) {
                    String Explicacao = "Herança é o conjunto de bens, direitos e obrigações, que uma pessoa falecida deixa aos seus sucessores. Entende-se a herança como um todo, mesmo que sejam vários os herdeiros. Até que se faça a partilha dos bens, nenhum herdeiro possui posse exclusiva de seus bens.";

                    textArea1.setText(Explicacao);

                }else if (comboBox1.getSelectedIndex() == 3) {
                    String Explicacao = "O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, que faça sentido para um membro particular.";

                    textArea1.setText(Explicacao);

                }else if (comboBox1.getSelectedIndex() == 4) {
                    String Explicacao = "A sobrecarga (overload) consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome. Entretanto, eles necessariamente devem possuir argumentos diferentes para funcionar.";

                    textArea1.setText(Explicacao);

                }

            }

        });

    }

}