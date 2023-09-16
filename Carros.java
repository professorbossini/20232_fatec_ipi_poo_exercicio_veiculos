public class Carros {
    private String modeloCarro;
    private String numeroPlaca;

    public String getModeloCarro() {
        return modeloCarro;
    };

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public void exibirCarro() {
        System.out.printf("Exibindo\n");
    }

    Carros(String modelo, String placa) {
        this.modeloCarro = modelo;
        this.numeroPlaca = placa;
    }

}
