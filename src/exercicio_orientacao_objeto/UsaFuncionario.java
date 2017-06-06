package exercicio_orientacao_objeto;

/**
 * Created by emanu on 05/06/2017.
 */
public class UsaFuncionario {

    public static void main(String[] args) {
       Funcionario fl = new Funcionario();

      fl.mostra();
     System.out.print("acessando o metodo direto do main: " + fl.recebeAumento(200));

    }

}
