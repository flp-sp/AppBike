import java.time.LocalTime;
import java.util.Scanner;

import classes.Bicicleta;
import classes.Estacao;
import classes.Estudante;

public class AppBikeTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("=============================\nBem vindo ao AppBike Terminal\n=============================");

        Estacao estacaoPrincipal = new Estacao("Estação Principal", "Rua Universitaria, 1252",10,
                                                new Bicicleta(1, "Caloi", "Funcionando", 32.1),
                                                new Bicicleta(2, "Monark", "Funcionando", 62.1),
                                                2, 1.8);

        Estacao estacaoSecundaria = new Estacao("Estação Secundária", "Rua Oposta, 1452",6,
                                                new Bicicleta(3, "Caloi", "Funcionando", 31.0),
                                                new Bicicleta(4, "Monark", "Manutenção", 60.1),
                                                2, 1.3);

        Estudante estudante = new Estudante("User","user.abc@xyz.o", "123456", 50.0);

        estacaoPrincipal.listStatus();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua matricula");
        String inMatricula = scanner.nextLine();

        System.out.println("Insira a partida\n1) Estação Principal\n2) Estação Secundária");
        int inPartida = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o destino");
        String inDestino = scanner.nextLine();

        System.out.println("Digite o horário de início (HH:mm):");
        LocalTime horaInicio = LocalTime.parse(scanner.nextLine());

        System.out.println("Digite o horário de fim (HH:mm):");
        LocalTime horaFim = LocalTime.parse(scanner.nextLine());

        if (inPartida == 1){
            estacaoSecundaria.devolverBicicleta(estacaoPrincipal.retirarBicicleta());
            if (estudante.auth(inMatricula)){
                estudante.criarCorrida("Estação Principal", inDestino, horaInicio, horaFim);
            }
        }else if (inPartida == 2){
            estacaoPrincipal.devolverBicicleta(estacaoSecundaria.retirarBicicleta());
            if (estudante.auth(inMatricula)){
                estudante.criarCorrida("Estação Secundária", inDestino, horaInicio, horaFim);
            }
        }

        scanner.close();

        estudante.visualizarHistorico();
    }
}