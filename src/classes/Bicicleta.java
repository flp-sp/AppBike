package classes;

import java.util.Scanner;

public class Bicicleta {
    int id;
    String modelo;
    String condicao;
    double quilometragem;

    public Bicicleta(int id, String modelo, String condicao, double quilometragem){
        this.id = id;
        this.modelo = modelo;
        this.condicao = condicao;
        this.quilometragem = quilometragem;
    }

    void retirar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua matricula");
        String inMatricula = scanner.nextLine();

        System.out.println("Insira a partida");
        String inSaida = scanner.nextLine();

        System.out.println("Insira o destino");
        String inDestino = scanner.nextLine();

        System.out.println("Insira a duração em minutos");
        int inDuracao = scanner.nextInt();
        scanner.close();
    }

    void devolver(){

    }

    void enviarManuntecao(){
        
    }
}
