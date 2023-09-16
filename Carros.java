import java.util.Calendar;

public class Carros{
    
    private String modelo;
    private Integer anoFabricacao;

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setAnoFabricacao(Integer anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirModelo (){
        System.out.printf("O modelo do carro é %s\n", modelo);
    }

    public Integer idadeCarro(){
        Calendar agora = Calendar.getInstance();
        int ano = agora.get(Calendar.YEAR);
        int idade = ano - anoFabricacao;
        return idade;
    }

    Carros(String modelo, Integer anoFabricacao){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
}