package View;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroAtleta extends JFrame {
    private JButton btnEsports;
    private JButton btnFutebol;
    private JButton btnVolei;

    public TelaCadastroAtleta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnEsports = new JButton("Atleta de Esportes Eletrônicos");
        btnFutebol = new JButton("Atleta de Futebol");
        btnVolei = new JButton("Atleta de Volei");
        setSize(300,120);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        add(btnEsports);
        add(btnFutebol);
        add(btnVolei);

        setVisible(true);
    }

    public JButton getBtnEsports() {
        return btnEsports;
    }

    public JButton getBtnFutebol() {
        return btnFutebol;
    }

    public JButton getBtnVolei() {
        return btnVolei;
    }
}
