package orientacao_objeto;

import exercicio_orientacao_objeto.Funcionario;

/**
 * Created by emanu on 06/06/2017.
 */
public class TestaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.empregados = new Funcionario[2]; //criei um vetor de 10 posicoes

       Funcionario funcionario = new Funcionario();
       funcionario.salario = 1500.00;
       empresa.criaFuncionario(funcionario);


        Funcionario funcionario2 = new Funcionario();
        funcionario.salario = 2500.00;
        empresa.criaFuncionario(funcionario2);

        empresa.mostraFuncionario();

    }




}
