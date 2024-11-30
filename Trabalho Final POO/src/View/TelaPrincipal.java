    package View;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class TelaPrincipal extends JFrame {
        private JButton botaoCadastrarAtleta;
        private JButton botaoExcluirAtleta;
        private JButton botaoListarAtletas;
        private JButton botaoQuantidadePorInstancia;
        private JButton botaoEstatisticasGerais;

        private JPanel painelCentral;

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
            botaoQuantidadePorInstancia = new JButton("Quantidade por tipo");
            botaoEstatisticasGerais = new JButton("Estatisticas Gerais");

            botoes.add(botaoCadastrarAtleta);
            botoes.add(botaoExcluirAtleta);
            botoes.add(botaoListarAtletas);
            botoes.add(botaoQuantidadePorInstancia);
            botoes.add(botaoEstatisticasGerais);

            painelCentral = new JPanel();
            painelCentral.setLayout(new BorderLayout());

            add(botoes, BorderLayout.NORTH);
            add(painelCentral, BorderLayout.CENTER);

            setVisible(true);

            class IniciarTelaCadastroAtletas implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TelaCadastroAtleta cadastro = new TelaCadastroAtleta();
                }
            }
            IniciarTelaCadastroAtletas i = new IniciarTelaCadastroAtletas();
            botaoCadastrarAtleta.addActionListener(i);
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
        
            public JButton getBotaoQuantidadePorInstancia() {
                return botaoQuantidadePorInstancia;
            }
        
            public JButton getBotaoEstatisticas() {
                return botaoEstatisticasGerais;
            }
        
            public void atualizarPainelCentral(JPanel novoPainel) {
                painelCentral.removeAll();
                painelCentral.add(novoPainel, BorderLayout.CENTER);
                painelCentral.revalidate();
                painelCentral.repaint();
            
        }
    }