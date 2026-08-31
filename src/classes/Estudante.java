package classes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Estudante {
    String nome;
    String email;
    String matricula;
    double saldo;
    List<Corrida> historicoCorrida = new ArrayList<Corrida>();

    public Estudante(String nome, String email, String matricula, double saldo) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.saldo = saldo;
    }

    double consularSaldo(){
        return saldo;
    }

    public void criarCorrida(String origem, String destino, LocalTime inicio, LocalTime fim){
        Corrida novaCorrida = new Corrida(origem, destino, inicio, fim, 0.0);
        novaCorrida.valorCobrado = novaCorrida.calcularCusto();
        saldo -= novaCorrida.valorCobrado;
        historicoCorrida.add(novaCorrida);
    }

    void adicionarCredito(double credito){
        saldo += credito;
    }

    public void visualizarHistorico() {
    System.out.println("=== HISTÓRICO DE CORRIDAS ===");
    if (historicoCorrida.size() != 0) {
        for (int i = 0; i < historicoCorrida.size(); i++) {
            Corrida c = historicoCorrida.get(i);
            System.out.printf("Corrida %d: %s -> %s | Início: %s | Fim: %s | Valor: R$ %.2f\n",
                (i + 1),
                c.nomeEstacaoOrigem,
                c.nomeEstacaoDestino,
                c.horaInicio,
                c.horaFim,
                c.valorCobrado
            );
        }
    } else {
        System.out.println("Nenhuma corrida registrada no histórico.");
    }
}

    public boolean auth(String matricula){
        if (this.matricula.equals(matricula)){
            return true;
        }
        return false;
    }

    
}
