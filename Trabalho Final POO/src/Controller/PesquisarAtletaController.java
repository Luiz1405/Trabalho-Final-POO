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
        

        JButton pesquisar = new JButton("Pesquisar");
        painelPesquisa.add(pesquisar);
        telaPrincipal.atualizarPainelCentral(painelPesquisa);

        pesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = nomeAtleta.getText();
                Atleta atletaEcontrado = gerenciadorDeAtletas.buscarAtletaPorNome(nome);                for (Atleta o : gerenciadorDeAtletas.getLista()){
                    
                if(atletaEcontrado != null) {
                    JTextArea areaAtletaEncontrado = new JTextArea(10,30);
                    areaAtletaEncontrado.setText(atletaEcontrado.toString());
                    areaAtletaEncontrado.setEditable(false);

                    //Adicionei um scroll caso tiver mais de um atleta ou muitas informações
                    JPanel mostrarResultado = new JPanel();
                    mostrarResultado.add(new JScrollPane(areaAtletaEncontrado));
                    telaPrincipal.atualizarPainelCentral(mostrarResultado);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Atleta não encontrado.");
                    
                }
                }
            }
        });
    }
}
