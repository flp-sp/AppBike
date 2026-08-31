package classes;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Corrida {
    String nomeEstacaoOrigem;
    String nomeEstacaoDestino;
    LocalTime horaInicio;
    LocalTime horaFim;
    double valorCobrado;
    double custoEstacao;

    public Corrida(String nomeEstacaoOrigem, String nomeEstacaoDestino, LocalTime horaInicio, LocalTime horaFim, double valorCobrado) {
        this.nomeEstacaoOrigem = nomeEstacaoOrigem;
        this.nomeEstacaoDestino = nomeEstacaoDestino;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.valorCobrado = valorCobrado;
    }

    long calcularDuracao() {
        return ChronoUnit.MINUTES.between(horaInicio, horaFim);
    }

    double calcularCusto(){
        if (nomeEstacaoOrigem.equals("Estação Principal")){
            custoEstacao = 1.8;
        } else if (nomeEstacaoOrigem.equals("Estação Secundária")){
            custoEstacao = 1.3;
        }
        return (calcularDuracao() * custoEstacao);
    }
}
