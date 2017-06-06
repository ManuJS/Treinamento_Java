package segundo_passo;

/**
 * Created by emanu on 02/06/2017.
 */
public class BalancoTrimestral {

    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = (gastosTrimestre/3);

        System.out.println(gastosTrimestre);
        System.out.println("media mensal: " +mediaMensal);

    }
}
