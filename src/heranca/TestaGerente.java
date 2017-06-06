package heranca;

/**
 * Created by emanu on 06/06/2017.
 */
public class TestaGerente {

    public static void main(String[] args) {

//        Gerente gerente = new Gerente();
//
//        gerente.setNome("Emanuelle Menali");
//        gerente.setSenha(4231);
//
//        gerente.setSalario(5000.0);
//        System.out.println(gerente.getBonificacao());

        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);
        funcionario.getBonificacao();


    }
}
