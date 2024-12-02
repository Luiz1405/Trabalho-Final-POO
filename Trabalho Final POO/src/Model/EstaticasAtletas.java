package Model;

public class EstaticasAtletas {
    
    private double mediaSalarioTotal;
    private double somaSalarioTotal;
    private double menorSalario;
    private double maiorSalario;
    private int numeroDeAtletas;
    private int numeroAtletaEletronico;
    private int numeroAtletaFutebol;
    private int numeroAtletaVolei;

    public EstaticasAtletas(double mediaSalarioTotal, double somaSalarioTotal, double menorSalario, double maiorSalario, int numeroDeAtletas, int numeroAtletaEletronico, int numeroAtletaFutebol, int numeroAtletaVolei) {
        this.mediaSalarioTotal = mediaSalarioTotal;
        this.somaSalarioTotal = somaSalarioTotal;
        this.menorSalario = menorSalario;
        this.maiorSalario = maiorSalario;
        this.numeroDeAtletas = numeroDeAtletas;
        this.numeroAtletaEletronico = numeroAtletaEletronico;
        this.numeroAtletaFutebol = numeroAtletaFutebol;
        this.numeroAtletaVolei = numeroAtletaVolei;
    }

    public double getMediaSalarioTotal() {
        return mediaSalarioTotal;
    }

    public double getSomaSalarioTotal() {
        return somaSalarioTotal;
    }

    public double getMenorSalario() {
        return menorSalario;
    }

    public double getMaiorSalario() {
        return maiorSalario;
    }

    @Override
public String toString() {
    return String.format(
        "Média Salarial: R$%.2f\n" +
        "Soma Total dos salários: R$%.2f\n" +
        "Maior Salário: R$%.2f\n" +
        "Menor Salário: R$%.2f\n" +
        "Número total de atletas: %d\n" +
        "Número total de jogadores de Esportes Eletrônicos: %d\n" +
        "Número total de jogadores de Futebol: %d\n" +
        "Número total de jogadores de Vôlei: %d",
        mediaSalarioTotal, somaSalarioTotal, maiorSalario, menorSalario, 
        numeroDeAtletas, numeroAtletaEletronico, numeroAtletaFutebol, numeroAtletaVolei
    );
}
}
