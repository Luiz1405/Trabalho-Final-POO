public class JogadorDeEsportesEletronicos extends Atleta {

    private String time;

    private int vitorias;
    private int derrotas;

    public JogadorDeEsportesEletronicos(String nome, int idade, String nacionalidade, double salario, String time, int vitorias, int derrotas){
        super(nome, idade, nacionalidade, salario);
        this.time = time;
        this.vitorias = vitorias;
        this.derrotas = derrotas;

    }

    public String getTime() {
        return time;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    // metodo que calcula a taxa de vitoria
    public double taxaDeVitoria() {
        return (vitorias / vitorias+derrotas) * 100;
    }

    public String toString(){
        return String.format( "[Time: %s, Vitorias: %d, Derrotas: %d]", super.toString(), time, vitorias, derrotas);
    }

    
}
