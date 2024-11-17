package Model;
public class JogadorDeVolei extends Atleta {

    private String posicao;
    private int aces;
    private int bloqueios;
    private int pontosFeitos;
    private double altura;


    public JogadorDeVolei(String nome, int idade, String nacionalidade, double salario, String posicao, int aces, int bloqueios, int pontosFeitos, double altura) {
        super(nome, idade, nacionalidade, salario);
        this.posicao = posicao;
        this.aces = aces;
        this.bloqueios = bloqueios;
        this.pontosFeitos = pontosFeitos;
        this.altura = altura;
    }

    public String getPosicao(){
        return posicao;
    }

    public int getAces() {
        return aces;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    public int getBloqueios() {
        return bloqueios;
    }

    public void setBloqueios(int bloqueios) {
        this.bloqueios = bloqueios;
    }

    public int getPontosFeitos() {
        return pontosFeitos;
    }

    public void setPontosFeitos(int pontosFeitos) {
        this.pontosFeitos = pontosFeitos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
        return String.format("[Posicao: %s, posicao, Aces: %d, Bloqueios: %d, Pontos Feitos: %d, Altura: %.2f]", super.toString(), 
        posicao, aces, bloqueios, pontosFeitos, altura);
    }


    
}
