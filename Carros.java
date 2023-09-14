
public class Carros(){
    
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
    public void setAnoFabricacao(){
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirModelo (){
        System.out.printf("O modelo do carro e %s", modelo);
    }

    public Integer idadeCarro(){
        
        Calendar agora = Calendar.getInstance();
        int ano = Calendar.get(Calendar.YEAR);



    }
}