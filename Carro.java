
public class Carro {
    
    private String modelo;
    private String cor;
    
    public Carro(String modelo, String cor) {
    this.modelo = modelo;
    this.cor = cor;
    }
    
    public String getModelo() {
    return this.modelo;
    }
    
    public void setModelo(String modelo) {
    this.modelo = modelo;
    }
    
    public String getCor() {
    return this.cor;
    }
    
    public void setCor(String cor) {
    this.cor = cor;
    }
    
    public void mostrarCarro() {
    System.out.println("O carro é um " + this.modelo + " de cor " + this.cor + ".");
    }
    
}