package orientacao_objeto;

/**
 * Created by emanu on 02/06/2017.
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        Conta minhaSegundaConta;
        minhaSegundaConta = new Conta();

//        minhaConta.dono = "Emanuelle";
        minhaConta.saldo = 1000.00;

        minhaConta.saca(100);
        minhaConta.deposita(300);
        System.out.println("Saldo atual: " + minhaConta.saldo);


        minhaSegundaConta.saldo = 30000.00;

        minhaSegundaConta.saca(1000);
        minhaSegundaConta.deposita(3000);
        System.out.println("Saldo atual segunda conta: " + minhaSegundaConta.saldo);

    }
}
