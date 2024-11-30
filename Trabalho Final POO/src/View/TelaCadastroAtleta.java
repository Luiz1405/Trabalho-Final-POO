package View;

import Model.Atleta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroAtleta extends JFrame {
    private JLabel lbNome;
    private JLabel lbIdade;
    private JLabel lbNacionalidade;
    private JLabel lbSalario;
    private JButton btnSalvar;
    private JPanel painel;

    public TelaCadastroAtleta() {
        setTitle("Cadastro de Atleta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLocationRelativeTo(null);

        lbNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20);

        lbIdade = new JLabel("Idade:");
        JTextField txtIdade = new JTextField(20);

        lbNacionalidade = new JLabel("Nacionalidade:");
        JTextField txtNacionalidade = new JTextField(20);

        lbSalario = new JLabel("Salario:");
        JTextField txtSalario = new JTextField(20);

        btnSalvar = new JButton("Salvar");

        add(lbNome);
        add(txtNome);
        add(lbIdade);
        add(txtIdade);
        add(lbNacionalidade);
        add(txtNacionalidade);
        add(lbSalario);
        add(txtSalario);
        add(new Label());
        add(btnSalvar);

        setVisible(true);

        class botaoSalvar implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                int idade = Integer.parseInt(txtIdade.getText());
                String nacionalidade = txtNacionalidade.getText();
                double salario = Double.parseDouble(txtSalario.getText());

                if(nome.isEmpty() || idade <= 0 || nacionalidade.isEmpty() || salario <= 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, é necessário preencher todos os campos.");
                } else {
                    //AQUI PRECISA SER COLOCADO UMA CHAMADA DE MÉTODO PARA ADICIONAR O ATLETA A LISTA, PORÉM COMO FAZER
                    //PARA VERIFICAR O TIPO DE ATLETA E ADICIONAR OS SEUS ATRIBUTOS ESPECIFICOS?
                    JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso.");
                    setVisible(false);
                }
            }
        }
        botaoSalvar salvar = new botaoSalvar();
        btnSalvar.addActionListener(salvar);
    }
}
