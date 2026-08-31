package classes;

import java.util.ArrayList;
import java.util.List;

public class Estacao {
    String nome;
    String endereco;
    int maxVagas;
    List<Bicicleta> listBike = new ArrayList<Bicicleta>();
    int vagasOcupadas;
    double tarifaMinuto;

    public Estacao(String nome, String endereco, int maxVagas, Bicicleta bike1, Bicicleta bike2, int vagasOcupadas, double tarifaMinuto){
        this.nome = nome;
        this.endereco = endereco;
        this.maxVagas = maxVagas;
        listBike.add(bike1);
        listBike.add(bike2);
        this.vagasOcupadas = vagasOcupadas;
        this.tarifaMinuto = tarifaMinuto;
    }

    boolean hasSpot(){
        if (maxVagas - vagasOcupadas != 0){
            return true;
        }
        return false;
    }

    public Bicicleta retirarBicicleta(){
        if (listBike.size() != 0){
            for (int i = 0; i < listBike.size(); i++){
                if (listBike.get(i).condicao.equals("Funcionando")){
                    Bicicleta currentBike = listBike.get(i);
                    listBike.remove(i);
                    return currentBike;
                }
            }
        }
        return null;
    }

    public void devolverBicicleta(Bicicleta bike){
        listBike.add(bike);
    }

    public void listStatus(){
        System.out.printf("Bem vindo a %s\nEndereço: %s\n", nome, endereco);
        System.out.print("Bicicletas disponiveis:");
        if (listBike.size() != 0){
            for (int i = 0; i < listBike.size(); i++){
                System.out.print(" " + listBike.get(i).id);
            }
            System.out.print("\n");
        }else{
            System.out.println("Sem bicicletas disponíveis");
        }
        System.out.println("A tarifa por minuto é: " + tarifaMinuto + " reais.");
    }
}
