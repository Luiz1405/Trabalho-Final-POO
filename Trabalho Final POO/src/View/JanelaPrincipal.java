package View;
import javax.swing.*;

public class JanelaPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gerenciador de Atletas");
        frame.setSize(600, 400);//Aqui estamos definindo a largura e altura.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//aqui estamos definindo para fechar o programa ao clicar no x.


        //Aqui estamos inicializando o painel principal
        JPanel janelaPrincipal = new JPanel();
        frame.add(janelaPrincipal);

        //Deixamos a tela visivel.
        frame.setVisible(true);

        JLabel titulo = new JLabel("\nBem vindo ao gerenciador de Atletas!");
        JButton botaoDeCadastro = new JButton("Cadastrar atletas");
        JButton botaoDeEstatisticas = new JButton("Estatisticas Gerais.");

        janelaPrincipal.add(titulo);
        janelaPrincipal.add(botaoDeCadastro);
        janelaPrincipal.add(botaoDeEstatisticas);
        
    }
}
