package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.GerenciadorDeAtletas;
import View.TelaCadastroAtleta;
import View.TelaCadastroEsports;
import View.TelaCadastroFutebol;
import View.TelaCadastroVolei;

public class CadastroAtletaController {
    private TelaCadastroAtleta telaCadastroAtleta;
    private GerenciadorDeAtletas gerenciadorDeAtletas;

    public CadastroAtletaController(TelaCadastroAtleta telaCadastroAtleta, GerenciadorDeAtletas gerenciadorDeAtletas) {
        this.telaCadastroAtleta = telaCadastroAtleta;
        this.gerenciadorDeAtletas = gerenciadorDeAtletas;

        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == telaCadastroAtleta.getBtnEsports()) {
                    telaCadastroAtleta.setVisible(false);
                    TelaCadastroEsports c = new TelaCadastroEsports(gerenciadorDeAtletas);
                }
                else if (source == telaCadastroAtleta.getBtnFutebol()) {
                    telaCadastroAtleta.setVisible(false);
                    TelaCadastroFutebol c = new TelaCadastroFutebol(gerenciadorDeAtletas);
                }

                else if (source == telaCadastroAtleta.getBtnVolei()) {
                    telaCadastroAtleta.setVisible(false);
                    TelaCadastroVolei c = new TelaCadastroVolei(gerenciadorDeAtletas);
                }
            }
        };

        telaCadastroAtleta.getBtnEsports().addActionListener(a);
        telaCadastroAtleta.getBtnFutebol().addActionListener(a);
        telaCadastroAtleta.getBtnVolei().addActionListener(a);
    }
}
