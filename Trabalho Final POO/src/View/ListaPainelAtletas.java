package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.AbstractCellEditor;

import Model.Atleta;
import Model.GerenciadorDeAtletas;

public class ListaPainelAtletas extends JPanel implements ActionListener {
    private TelaPrincipal tela;
    private GerenciadorDeAtletas gerenciador;

    public ListaPainelAtletas(GerenciadorDeAtletas gerenciador, TelaPrincipal telaPrincipal) {
        this.tela = telaPrincipal;
        this.gerenciador = gerenciador;

        this.tela.getBotaoListarAtletas().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Cria o modelo da tabela com as colunas especificadas
        String[] colunas = { "Nome", "Idade", "Esporte", "Nacionalidade", "Salário", "Ação" };
        DefaultTableModel model = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Permite edição apenas na coluna de ação
            }
        };

        // Preenche o modelo da tabela com dados dos atletas
        for (Atleta atleta : gerenciador.getLista()) {
            Object[] data = {
                atleta.getNome(),
                String.valueOf(atleta.getIdade()),
                atleta.getEsporte(),
                atleta.getNacionalidade(),
                String.valueOf(atleta.getSalario()),
                "Deletar" // Texto do botão de exclusão
            };
            model.addRow(data);
        }

        // Cria a tabela
        JTable tabela = new JTable(model);

        // Define o renderizador e editor de célula para a coluna de ação
        tabela.getColumn("Ação").setCellRenderer(new ButtonRenderer());
        tabela.getColumn("Ação").setCellEditor(new ButtonEditor(new JButton(), gerenciador, tabela));

        // Cria o painel de rolagem
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

    class ButtonRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton button = new JButton("Deletar");
            return button;
        }
    }

    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private JButton button;
        private GerenciadorDeAtletas gerenciador;
        private JTable tabela;
        private int currentRow;

        public ButtonEditor(JButton button, GerenciadorDeAtletas gerenciador, JTable tabela) {
            this.button = button;
            this.gerenciador = gerenciador;
            this.tabela = tabela;
            button.addActionListener(this);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.currentRow = row;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "Deletar";
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int modelRow = tabela.convertRowIndexToModel(currentRow);
            gerenciador.getLista().remove(modelRow); // Remove o atleta da lista do gerenciador
            ((DefaultTableModel) tabela.getModel()).removeRow(modelRow); // Remove a linha da tabela
            fireEditingStopped(); // Para a edição da célula
        }
    }
}
