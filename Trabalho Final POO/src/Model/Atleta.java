package Model;
public abstract class Atleta{
    private String nome;
    private int idade;
    private String nacionalidade;
    private double salario;
    
    public Atleta(String nome, int idade, String nacionalidade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
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

    //Fazer um método abstrato para criar estatisticas especificas de cada atleta
    @Override
    public String toString(){
        return String.format("[Nome do atleta: %s, Idade do atleta: %d, Nacionalidade: %s, Salario: R$%.2f]", nome, idade, nacionalidade, salario);
    }
}