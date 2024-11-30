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

    public String toString(){
        return String.format(
        "Estátisicas Gerais\n" ,
        "Média Salarial: R$%.2f\n" ,
        "\nSoma Total dos salários: R$%.2f" ,
        "\nMaior Salario: R$%.2f" ,
        "\nMenor Salario: R$%.2f",
        "\nNúmero total de atletas: %d" ,
        "\nNúmero total de jogadores de Esportes eletronicos: %d" ,
        "\nNúmero total de jgoadores de futebol: %d" ,
        "\nNúmero total de jogadores de Volei: %d" ,
         mediaSalarioTotal, somaSalarioTotal, maiorSalario, menorSalario, numeroDeAtletas, numeroAtletaEletronico, numeroAtletaFutebol, numeroAtletaVolei);
    }

    
}
