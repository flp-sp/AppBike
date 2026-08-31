package classes;

import java.util.ArrayList;
import java.util.List;

public class Estacao {
    private String nome;
    private String endereco;
    private int maxVagas;
    private List<Bicicleta> listBikeId = new ArrayList<Bicicleta>();
    private int vagasOcupadas;
    private double tarifaMinuto;

    public Estacao(String nome, String endereco, int maxVagas, Bicicleta bike1, Bicicleta bike2, int vagasOcupadas, double tarifaMinuto){
        this.nome = nome;
        this.endereco = endereco;
        this.maxVagas = maxVagas;
        listBikeId.add(bike1);
        listBikeId.add(bike2);
        this.vagasOcupadas = vagasOcupadas;
        this.tarifaMinuto = tarifaMinuto;
    }

    boolean hasSpot(){
        if (maxVagas - vagasOcupadas != 0){
            return true;
        }
        return false;
    }

    public void retirarBicicleta(){

    }

    public void devolverBicicleta(){

    }

    public void listStatus(){
        System.out.printf("Bem vindo a %s\nEndereço: %s\n", nome, endereco);
        System.out.print("Bicicletas disponiveis:");
        if (listBikeId.size() != 0){
            for (int i = 0; i < listBikeId.size(); i++){
                System.out.print(" " + listBikeId.get(i).id);
            }
            System.out.print("\n");
        }else{
            System.out.println("Sem bicicletas disponíveis");
        }
        System.out.println("A tarifa por minuto é: " + tarifaMinuto + " reais.");
    }
}
