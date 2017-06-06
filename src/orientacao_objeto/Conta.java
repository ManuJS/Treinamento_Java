package orientacao_objeto;

/**
 * Created by emanu on 02/06/2017.
 */
public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;
    Cliente titular;

    double salario;

    void saca (double quantidade){

        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void deposita (double quantidade){
        this.saldo += quantidade;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
