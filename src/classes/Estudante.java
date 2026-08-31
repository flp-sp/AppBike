package classes;

public class Estudante {
    String nome;
    String email;
    String matricula;
    double saldo;

    public Estudante(){
        nome = "User";
        email = "user.abc@xyz.o";
        matricula = "123456";
        saldo = 50.0;

    }

    double consularSaldo(){
        return saldo;
    }

    void adicionarCredito(float credito){

    }

    void visualizarHistorico(){
        
    }

    
}
