package View;

import Model.GerenciadorDeAtletas;
import Model.JogadorDeFutebol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroFutebol extends JFrame {
    private JLabel lbNome, lbIdade, lbNacionalidade, lbSalario, lbPosicao, lbGols, lbAssistencias;
    private JTextArea txtNome, txtIdade, txtNacionalidade, txtSalario, txtPosicao, txtGols, txtAssistencias;
    private JButton btnSalvar;
    private GerenciadorDeAtletas gerenciadorDeAtletas;

    public TelaCadastroFutebol(GerenciadorDeAtletas gerenciadorDeAtletas) {
        setLayout(new BorderLayout());
        JPanel painelCima = new JPanel(new GridLayout(4, 2, 10, 10));
        lbNome = new JLabel("Nome:");
        txtNome = new JTextArea();
        painelCima.add(lbNome);
        painelCima.add(txtNome);

        lbIdade = new JLabel("Idade:");
        txtIdade = new JTextArea();
        painelCima.add(lbIdade);
        painelCima.add(txtIdade);

        lbNacionalidade = new JLabel("Nacionalidade:");
        txtNacionalidade = new JTextArea();
        painelCima.add(lbNacionalidade);
        painelCima.add(txtNacionalidade);

        lbSalario = new JLabel("Salario:");
        txtSalario = new JTextArea();
        painelCima.add(lbSalario);
        painelCima.add(txtSalario);

        lbPosicao = new JLabel("Posição:");
        txtPosicao = new JTextArea();
        painelCima.add(lbPosicao);
        painelCima.add(txtPosicao);

        lbGols = new JLabel("Gols:");
        txtGols = new JTextArea();
        painelCima.add(lbGols);
        painelCima.add(txtGols);

        lbAssistencias = new JLabel("Assistências:");
        txtAssistencias = new JTextArea();
        painelCima.add(lbAssistencias);
        painelCima.add(txtAssistencias);

        btnSalvar = new JButton("Salvar");

        add(painelCima, BorderLayout.NORTH);
        add(btnSalvar, BorderLayout.SOUTH);

        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro Atleta de Futebol");
        setLocationRelativeTo(null);
        setVisible(true);

        class botaoSalvar implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String idadeTexto = txtIdade.getText();
                String nacionalidade = txtNacionalidade.getText();
                String salarioTexto = txtSalario.getText();
                String posicao = txtPosicao.getText();
                String golsTexto = txtGols.getText();
                String assistenciasTexto = txtAssistencias.getText();

                if (nome.isEmpty() || idadeTexto.isEmpty() || nacionalidade.isEmpty() || salarioTexto.isEmpty() || posicao.isEmpty() || golsTexto.isEmpty() || assistenciasTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, é necessário preencher todos os campos.");
                }

                int idade = Integer.parseInt(idadeTexto);
                double salario = Double.parseDouble(salarioTexto);
                int gols = Integer.parseInt(golsTexto);
                int assistencias = Integer.parseInt(assistenciasTexto);
                if (idade <= 0 || salario <= 0 || gols <= 0 || assistencias <= 0) {
                    JOptionPane.showMessageDialog(null, "Apenas números positivos são permitidos.");
                }

                JogadorDeFutebol atleta = new JogadorDeFutebol(nome, idade, nacionalidade, salario, posicao, gols, assistencias);
                gerenciadorDeAtletas.adicionarAtleta(atleta);

                JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso.");
                setVisible(false);
            }
        }

        botaoSalvar salvar = new botaoSalvar();
        btnSalvar.addActionListener(salvar);
    }
}
