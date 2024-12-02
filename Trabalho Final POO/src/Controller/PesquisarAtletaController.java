package Controller;

import View.TelaPrincipal;
import Model.GerenciadorDeAtletas;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
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
        JTextArea areaPesquisa = new JTextArea(10, 30);
        JPanel painelPesquisa = new JPanel();
        painelPesquisa.add(areaPesquisa);
        telaPrincipal.atualizarPainelCentral(painelPesquisa);

        JButton botaoVoltar = new JButton("Voltar");

        botaoVoltar.addActionListener(ev -> telaPrincipal.voltarPainelAnterior());

        painelPesquisa.add(botaoVoltar);
    }
}
