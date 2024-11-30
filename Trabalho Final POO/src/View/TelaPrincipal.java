    package View;
    import javax.swing.*;
    import java.awt.*;

    public class TelaPrincipal extends JFrame {
        private JButton botaoCadastrarAtleta;
        private JButton botaoExcluirAtleta;
        private JButton botaoListarAtletas;
        private JButton botaoEstatisticasGerais;

        private JPanel painelCentral;
        private JPanel painelAnterior;

        public TelaPrincipal(){
            setTitle("Gerenciador de Atletas");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600);
            setLayout(new BorderLayout());


            JPanel botoes = new JPanel();
            botoes.setLayout(new GridLayout(1, 5));
            
            botaoCadastrarAtleta = new JButton("Cadastrar Atleta");
            botaoExcluirAtleta = new JButton("Excluir Atleta");
            botaoListarAtletas = new JButton("Listar Todos Atletas");
            botaoEstatisticasGerais = new JButton("Estatisticas Gerais");

            botoes.add(botaoCadastrarAtleta);
            botoes.add(botaoExcluirAtleta);
            botoes.add(botaoListarAtletas);
            botoes.add(botaoEstatisticasGerais);

            painelCentral = new JPanel();
            painelCentral.setLayout(new BorderLayout());

            add(botoes, BorderLayout.NORTH);
            add(painelCentral, BorderLayout.CENTER);

            painelAnterior = new JPanel();
        }

            public JButton getBotaoCadastrarAtleta() {
                return botaoCadastrarAtleta;
            }
        
            public JButton getBotaoExcluirAtleta() {
                return botaoExcluirAtleta;
            }
        
            public JButton getBotaoListarAtletas() {
                return botaoListarAtletas;
            }
        
            public JButton getBotaoEstatisticas() {
                return botaoEstatisticasGerais;
            }
        
            public void atualizarPainelCentral(JPanel novoPainel) {
                painelAnterior = painelAnterior;
                painelCentral.removeAll();
                painelCentral.add(novoPainel, BorderLayout.CENTER);
                painelCentral.revalidate();
                painelCentral.repaint();
            
        }

            public void voltarPainelAnterior(){
            painelCentral.removeAll();
            painelCentral.add(painelAnterior, BorderLayout.CENTER);
            painelCentral.revalidate();
            painelCentral.repaint();
            }
    }