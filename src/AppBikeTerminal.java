import classes.Bicicleta;
import classes.Estacao;

public class AppBikeTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("=============================\nBem vindo ao AppBike Terminal\n=============================");
        Estacao estacaoPrincipal = new Estacao("Estação Principal", "Rua Universitaria, 1252",10,
                                                new Bicicleta(1, "Caloi", "Funcionando", 32.1),
                                                new Bicicleta(2, "Monark", "Funcionando", 62.1),
                                                2, 1.8);

        Estacao estacaoSecundaria = new Estacao("Estação Secundária", "Rua Oposta, 1452",6,
                                                new Bicicleta(1, "Caloi", "Funcionando", 31.0),
                                                new Bicicleta(2, "Monark", "Manutenção", 60.1),
                                                2, 1.3);
        estacaoPrincipal.listStatus();
        estacaoSecundaria.listStatus();
    }
}