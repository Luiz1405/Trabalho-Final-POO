package Model;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeAtletas {
    private List<Atleta> atletas;

    public GerenciadorDeAtletas(){
        this.atletas = new ArrayList<>();
    }


    //METODO PARA ADICIONAR ATLETA

    public boolean adicionarAtleta(Atleta atleta){
        for(Atleta o:atletas){
            if(o.getNome().equals(atleta.getNome())) {
                return false;
            }
        }
        atletas.add(atleta);
        return true;


    }
    public EstaticasAtletas getEstatisticasGerais(){
        double mediaSalarioTotal = atletas.stream()
               .mapToDouble(Atleta::getSalario)
               .average()
               .orElse(0.0); 
        
        double somaSalarioTotal = atletas.stream()
                                  .mapToDouble(Atleta::getSalario)  
                                  .sum();
        double maiorSalario = atletas.stream()
                              .mapToDouble(Atleta::getSalario)  
                              .max()
                              .orElse(0.0);
        double menorSalario = atletas.stream()
                              .mapToDouble(Atleta::getSalario)
                              .min()
                              .orElse(0.0);

        int totalAtletas = Atleta.getTotalAtletas();
        int jogadoresEletronicos = JogadorDeEsportesEletronicos.getContadorAtletaDeEsportesEletronicos();
        int jogadoresFutebol = JogadorDeFutebol.getContadorAtletaDeFutebol();
        int jogadoresVolei = JogadorDeVolei.getContadorAtletaVolei();
        return new EstaticasAtletas(mediaSalarioTotal, somaSalarioTotal, menorSalario, maiorSalario, totalAtletas, jogadoresEletronicos, jogadoresFutebol, jogadoresVolei);
                                 
    }
}
