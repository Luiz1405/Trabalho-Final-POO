package Model;
public abstract class Atleta{
    private static int contadorAtleta = 0;
    private String nome;
    private int idade;
    private String nacionalidade;
    private double salario;
    
    public Atleta(String nome, int idade, String nacionalidade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
        contadorAtleta++;
    }

    public static int getTotalAtletas(){
        return contadorAtleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract String getEsporte();
    
    @Override
    public String toString(){
        return String.format("[Nome do atleta: %s, Idade do atleta: %d, Nacionalidade: %s, Salario: R$%.2f]", nome, idade, nacionalidade, salario);
    }
}