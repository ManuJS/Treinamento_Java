package orientacao_objeto;

import exercicio_orientacao_objeto.Funcionario;

/**
 * Created by emanu on 06/06/2017.
 */
public class Empresa {

    Funcionario[] empregados;
    String cnpj;
    String endereco;
    String telefone;
    String razaoSocial;
    String nomeFantasia;

    int i;

    public void criaFuncionario (Funcionario f){



        if (i < empregados.length){
            empregados[i] = f;
            i++;
            System.out.println("Funcionário na posição: " + i);
        }else{
            System.out.println("Vetor cheio!");
        }
    }

    public void mostraFuncionario (){

        for (int i = 0; i < empregados.length; i++) {
            System.out.println(empregados[i].salario);
        }
//        System.out.println("funcionario: "+ this.empregados[0].toString());
    }
}
