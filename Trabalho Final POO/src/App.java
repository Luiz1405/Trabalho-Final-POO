import Controller.CadastroAtletaController;
import Controller.EstatisticasController;
import Model.GerenciadorDeAtletas;
import Model.JogadorDeEsportesEletronicos;
import Model.JogadorDeFutebol;
import Model.JogadorDeVolei;

import View.TelaCadastroAtleta;
import View.TelaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {

        GerenciadorDeAtletas gerenciadorDeAtletas = new GerenciadorDeAtletas();

    JogadorDeEsportesEletronicos jogador1 = new JogadorDeEsportesEletronicos("Lucas", 25, "Brasileiro", 5000.00, "TeamX", 30, 10);
    JogadorDeEsportesEletronicos jogador2 = new JogadorDeEsportesEletronicos("Carlos", 22, "Argentino", 6000.00, "TeamY", 25, 15);
    JogadorDeEsportesEletronicos jogador3 = new JogadorDeEsportesEletronicos("Renata", 28, "Brasileira", 5500.00, "TeamZ", 35, 5);
    JogadorDeEsportesEletronicos jogador4 = new JogadorDeEsportesEletronicos("Bruna", 30, "Brasileira", 7000.00, "TeamX", 50, 10);
   
    JogadorDeFutebol jogador5 = new JogadorDeFutebol("Felipe", 27, "Brasileiro", 8000.00, "Atacante", 20, 15);
    JogadorDeFutebol jogador6 = new JogadorDeFutebol("Gustavo", 24, "Brasileiro", 7500.00, "Meio Campo", 10, 25);
    JogadorDeFutebol jogador7 = new JogadorDeFutebol("Rafael", 30, "Argentino", 9500.00, "Zagueiro", 5, 5);
    JogadorDeFutebol jogador8 = new JogadorDeFutebol("Marcos", 26, "Chileno", 8000.00, "Goleiro", 0, 10);
   
    JogadorDeVolei jogador9 = new JogadorDeVolei("Amanda", 26, "Brasileira", 4500.00, "Central", 12, 18, 350, 1.85);
    JogadorDeVolei jogador10 = new JogadorDeVolei("Pedro", 29, "Brasileiro", 4800.00, "Ponta", 15, 20, 400, 1.92);
    JogadorDeVolei jogador11 = new JogadorDeVolei("Juliana", 24, "Mexicana", 4200.00, "Levantadora", 10, 25, 200, 1.78);
    JogadorDeVolei jogador12 = new JogadorDeVolei("Fabio", 32, "Brasileiro", 5000.00, "Libero", 20, 22, 300, 1.90);
    gerenciadorDeAtletas.adicionarAtleta(jogador1);
    gerenciadorDeAtletas.adicionarAtleta(jogador2);
    gerenciadorDeAtletas.adicionarAtleta(jogador3);
    gerenciadorDeAtletas.adicionarAtleta(jogador4);
    gerenciadorDeAtletas.adicionarAtleta(jogador5);
    gerenciadorDeAtletas.adicionarAtleta(jogador6);
    gerenciadorDeAtletas.adicionarAtleta(jogador7);
    gerenciadorDeAtletas.adicionarAtleta(jogador8);
    gerenciadorDeAtletas.adicionarAtleta(jogador9);
    gerenciadorDeAtletas.adicionarAtleta(jogador10);
    gerenciadorDeAtletas.adicionarAtleta(jogador11);
    gerenciadorDeAtletas.adicionarAtleta(jogador12);

        TelaPrincipal telaPrincipal = new TelaPrincipal(gerenciadorDeAtletas);

        EstatisticasController estatisticas = new EstatisticasController(telaPrincipal, gerenciadorDeAtletas);
        telaPrincipal.setVisible(true);

    }
}
