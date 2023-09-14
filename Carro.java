public class Carro{
    //Primeiro Atributo
    private String corCarro;
    //getter:
    public String getCorCarro(){
            return corCarro;
    }
    //setter:
    public void setCorCarro(String corCarro){
        this.corCarro = corCarro;
    }

    //Segundo Atributo
    private String placaCarro;
    //getter:
    public String getPlacaCarro(){
            return placaCarro;
    }
    //setter:
    public void setPlacaCarro(String placaCarro){
        this.placaCarro = placaCarro;
    }
    
    //Primeiro Método
    public void exibirCor(){
        System.out.println("A cor do carro é " + corCarro);
    }

    //Segundo Método
    public void exibirPlaca(){
        System.out.println("A placa do carro é " + placaCarro);
    }

}