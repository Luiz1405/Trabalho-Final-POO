package Model;

import java.util.function.Function;

public class JogadorDeFutebol extends Atleta {

    private String posicao;
    private int golsmarcados;
    private int assistencias;

    public JogadorDeFutebol(String nome, int idade, String nacionalidade, double salario, String posicao, int golsmarcados, int assistencias){
        super(nome, idade, nacionalidade, salario);

        this.posicao = posicao;
        this.golsmarcados = golsmarcados;
        this.assistencias = assistencias;
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

    //criar um metodo utilizando lambda para calcular o desempenho, com base em gols e assistencias.
    public double calcularDesempenho() {
        Function<JogadorDeFutebol, Double> desempenho = jogador -> jogador.getGolsmarcados() * 1.5 + jogador.getAssistencias();
        return desempenho.apply(this);
    }

    @Override
    public String toString(){
        return String.format("[Posicao: %s, Gols marcados: %d, Assistencias: %d]", super.toString() , posicao, golsmarcados, assistencias);
    }
    
}
