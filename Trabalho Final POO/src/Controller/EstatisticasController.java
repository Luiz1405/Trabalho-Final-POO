package Controller;

import View.TelaPrincipal;
import Model.GerenciadorDeAtletas;
import Model.EstaticasAtletas;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;

public class EstatisticasController implements ActionListener{

    private TelaPrincipal telaPrincipal;
    private GerenciadorDeAtletas gerenciadorDeAtletas;

    public EstatisticasController(TelaPrincipal telaPrincipal, GerenciadorDeAtletas gerenciadorDeAtletas){
        
        this.telaPrincipal = telaPrincipal;
        this.gerenciadorDeAtletas = gerenciadorDeAtletas;

        this.telaPrincipal.getBotaoEstatisticas().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e ){
        EstaticasAtletas estaticasAtletas = gerenciadorDeAtletas.getEstatisticasGerais();

        JTextArea areaEstatisticas = new JTextArea(10, 30);
        areaEstatisticas.setText(estaticasAtletas.toString());
        areaEstatisticas.setEditable(false);

        JPanel painelEstatisticas = new JPanel();
        painelEstatisticas.add(new JScrollPane(areaEstatisticas));

        telaPrincipal.atualizarPainelCentral(painelEstatisticas);

        JButton botaoVoltar = new JButton("Voltar");

        botaoVoltar.addActionListener(ev -> telaPrincipal.voltarPainelAnterior());

        painelEstatisticas.add(botaoVoltar);
    }

}
