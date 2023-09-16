public class TesteCarros{
    public static void main(String args []){

        String modelo1 = javax.swing.JOptionPane.showInputDialog("Digite o modelo do carro: ");
        Integer anoFabricacao1 = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o ano de fabricação do carro: "));
        var carro1 = new Carros (modelo1, anoFabricacao1);

        String modelo2 = javax.swing.JOptionPane.showInputDialog("Digite o modelo do carro: ");
        Integer anoFabricacao2 = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o ano de fabricação do carro: "));
        var carro2 = new Carros (modelo2, anoFabricacao2);

        carro1.exibirModelo();
        System.out.printf("O carro foi fabricado em %d e tem %d ano(s) de fabricação.\n\n", carro1.getAnoFabricacao(), carro1.idadeCarro());

        carro2.exibirModelo();
        System.out.printf("O carro foi fabricado em %d e tem %d ano(s) de fabricação.\n\n", carro2.getAnoFabricacao(), carro2.idadeCarro());

    }
}