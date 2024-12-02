package Model;
public class JogadorDeEsportesEletronicos extends Atleta {

    private static int contadorAtletaDeEsportesEletronicos = 0;

    private String time;
    private int vitorias;
    private int derrotas;

    public JogadorDeEsportesEletronicos(String nome, int idade, String nacionalidade, double salario, String time, int vitorias, int derrotas){
        super(nome, idade, nacionalidade, salario);
        this.time = time;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        contadorAtletaDeEsportesEletronicos++;

    }

    public static int getContadorAtletaDeEsportesEletronicos() {
        return contadorAtletaDeEsportesEletronicos;
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
    
    public String getEsporte(){
        return "E-Sports";
    }


    @Override
    public String toString(){
        return String.format( "[Base: %s, Time: %s, Vitorias: %d, Derrotas: %d]", super.toString(), time, vitorias, derrotas);
    }

    
}
