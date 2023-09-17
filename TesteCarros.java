public class TesteCarros {
    public static void main(String args[]) {
        String modeloCarro = javax.swing.JOptionPane.showInputDialog("Entre com o modelo do 1º carro.");
        String numeroPlaca = javax.swing.JOptionPane.showInputDialog("Entre com a placa do  1º carro.");
        var carro1 = new Carros(modeloCarro, numeroPlaca);

        String modeloCarro2 = javax.swing.JOptionPane.showInputDialog("Entre com o modelo do 2º carro.");
        String numeroPlaca2 = javax.swing.JOptionPane.showInputDialog("Entre com a placa do  2º carro.");
        var carro2 = new Carros(modeloCarro2, numeroPlaca2);

        carro1.exibirCarro();

        System.out.printf("O carro1: é\nmodelo: %s.\nplaca %s.\n", carro1.getModeloCarro(), carro1.getNumeroPlaca());

        carro2.exibirCarro();

        System.out.printf("O carro2: \nmodelo: %s.\nplaca %s.\n", carro2.getModeloCarro(), carro2.getNumeroPlaca());
    }
}
