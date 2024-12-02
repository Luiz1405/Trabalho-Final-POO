package Model;

import java.util.function.Function;

public class JogadorDeFutebol extends Atleta {
    private static int contadorAtletaDeFutebol = 0;

    private String posicao;
    private int golsmarcados;
    private int assistencias;

    public JogadorDeFutebol(String nome, int idade, String nacionalidade, double salario, String posicao, int golsmarcados, int assistencias){
        super(nome, idade, nacionalidade, salario);

        this.posicao = posicao;
        this.golsmarcados = golsmarcados;
        this.assistencias = assistencias;
        contadorAtletaDeFutebol++;
    }

    public static int getContadorAtletaDeFutebol() {
        return contadorAtletaDeFutebol;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getGolsmarcados() {
        return golsmarcados;
    }

    public void setGolsMarcados(int GolsMarcados){
        this.assistencias = golsmarcados;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public double calcularDesempenho() {
        Function<JogadorDeFutebol, Double> desempenho = jogador -> jogador.getGolsmarcados() * 1.5 + jogador.getAssistencias();
        return desempenho.apply(this);
    }

    public String getEsporte(){
        return "Futebol";
    }
    @Override
    public String toString(){
        return String.format("[Posicao: %s, Gols marcados: %d, Assistencias: %d]", super.toString() , posicao, golsmarcados, assistencias);
    }

}
