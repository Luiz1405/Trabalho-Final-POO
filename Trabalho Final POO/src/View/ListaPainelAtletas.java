package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import Model.Atleta;
import Model.EstaticasAtletas;
import Model.GerenciadorDeAtletas;


public class ListaPainelAtletas extends JPanel implements ActionListener{
    private TelaPrincipal tela;
    private GerenciadorDeAtletas gerenciador;

    public ListaPainelAtletas(GerenciadorDeAtletas gerenciador, TelaPrincipal telaPrincipal){
        this.tela=telaPrincipal;
        this.gerenciador=gerenciador;

        this.tela.getBotaoListarAtletas().addActionListener(this);
    }



        @Override
        public void actionPerformed(ActionEvent e) {
            // Cria o modelo da tabela com as colunas especificadas
            String[] colunas = {"Nome", "Idade", "Esporte", "Nacionalidade", "Salário"};
            DefaultTableModel model = new DefaultTableModel(colunas, 0);
    
            // Preenche o modelo da tabela com dados dos atletas
            for (Atleta atleta : gerenciador.getLista()) {
                String[] data = {
                    atleta.getNome(),
                    String.valueOf(atleta.getIdade()),
                    atleta.get(),
                    atleta.getNacionalidade(),
                    String.valueOf(atleta.getSalario())
                };
                model.addRow(data);
            }
    
            // Cria a tabela e o painel de rolagem
            JTable tabela = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(tabela);
    
            // Cria o painel para exibir a tabela
            JPanel painelTabela = new JPanel(new BorderLayout());
            painelTabela.add(scrollPane, BorderLayout.CENTER);
    
            // Cria o botão "Voltar" e adiciona ao painel
            JButton botaoVoltar = new JButton("Voltar");
            botaoVoltar.addActionListener(ev -> tela.voltarPainelAnterior());
            painelTabela.add(botaoVoltar, BorderLayout.SOUTH);
    
            // Atualiza o painel central da tela principal para exibir a tabela
            tela.atualizarPainelCentral(painelTabela);
        }
    }
    