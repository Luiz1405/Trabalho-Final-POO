package View;

import Model.GerenciadorDeAtletas;
import Model.JogadorDeVolei;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroVolei extends JFrame {
    private JLabel lbNome, lbIdade, lbNacionalidade, lbSalario, lbPosicao, lbAces, lbBloqueios, lbPontosFeitos, lbAltura;
    private JTextArea txtNome, txtIdade, txtNacionalidade, txtSalario, txtPosicao, txtAces, txtBloqueios, txtPontosFeitos, txtAltura;
    private JButton btnSalvar;
    private GerenciadorDeAtletas gerenciadorDeAtletas;

    public TelaCadastroVolei(GerenciadorDeAtletas gerenciadorDeAtletas) {
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

        lbAces = new JLabel("Aces:");
        txtAces = new JTextArea();
        painelCima.add(lbAces);
        painelCima.add(txtAces);

        lbBloqueios = new JLabel("Bloqueios:");
        txtBloqueios = new JTextArea();
        painelCima.add(lbBloqueios);
        painelCima.add(txtBloqueios);

        lbPontosFeitos = new JLabel("Pontos Feitos:");
        txtPontosFeitos = new JTextArea();
        painelCima.add(lbPontosFeitos);
        painelCima.add(txtPontosFeitos);

        lbAltura = new JLabel("Altura:");
        txtAltura = new JTextArea();
        painelCima.add(lbAltura);
        painelCima.add(txtAltura);

        btnSalvar = new JButton("Salvar");

        add(painelCima, BorderLayout.NORTH);
        add(btnSalvar, BorderLayout.SOUTH);

        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro Atleta de Volei");
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
                String acesTexto = txtAces.getText();
                String bloqueiosTexto = txtBloqueios.getText();
                String pontosFeitos = txtPontosFeitos.getText();
                String alturaTexto = txtAltura.getText();

                if (nome.isEmpty() || idadeTexto.isEmpty() || nacionalidade.isEmpty() || salarioTexto.isEmpty() || posicao.isEmpty() || acesTexto.isEmpty() || bloqueiosTexto.isEmpty() || pontosFeitos.isEmpty() || alturaTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, é necessário preencher todos os campos.");
                }

                int idade = Integer.parseInt(idadeTexto);
                double salario = Double.parseDouble(salarioTexto);
                int aces = Integer.parseInt(acesTexto);
                int bloqueios = Integer.parseInt(bloqueiosTexto);
                int pontos = Integer.parseInt(pontosFeitos);
                double altura = Double.parseDouble(alturaTexto);
                if (idade <= 0 || salario <= 0 || aces <= 0 || bloqueios <= 0 || pontos <= 0 || altura <= 0) {
                    JOptionPane.showMessageDialog(null, "Apenas números positivos são permitidos.");
                }

                JogadorDeVolei atleta = new JogadorDeVolei(nome, idade, nacionalidade, salario, posicao, aces, bloqueios, pontos, altura);
                gerenciadorDeAtletas.adicionarAtleta(atleta);

                JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso.");
                setVisible(false);
            }
        }

        botaoSalvar salvar = new botaoSalvar();
        btnSalvar.addActionListener(salvar);
    }
}
