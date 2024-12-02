package Controller;

import View.TelaPrincipal;
import Model.GerenciadorDeAtletas;
import Model.Atleta;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class PesquisarAtletaController implements ActionListener {
    private TelaPrincipal telaPrincipal;
    private GerenciadorDeAtletas gerenciadorDeAtletas;

    public PesquisarAtletaController(TelaPrincipal telaPrincipal, GerenciadorDeAtletas gerenciadorDeAtletas) {
        this.telaPrincipal = telaPrincipal;
        this.gerenciadorDeAtletas = gerenciadorDeAtletas;

        this.telaPrincipal.getBotaoPesquisarAtleta().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel painelPesquisa = new JPanel();
        JLabel pesquisaAtleta = new JLabel("Digite o nome do Atleta:");
        JTextField nomeAtleta = new JTextField(20);
        painelPesquisa.add(pesquisaAtleta);
        painelPesquisa.add(nomeAtleta);
        telaPrincipal.atualizarPainelCentral(painelPesquisa);

        JButton pesquisar = new JButton("Pesquisar");
        painelPesquisa.add(pesquisar);
        pesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeAtleta.getText();
                Object a = null;
                for (Atleta o : gerenciadorDeAtletas.getLista()){
                    if (o.getNome().equalsIgnoreCase(nome)){
                        a = o;
                    }
                }
                if (a != null) {
                    JOptionPane.showMessageDialog(null, "Atleta encontrado.");
                }
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Atleta não encontrado.");
                }
            }
        });
    }
}
