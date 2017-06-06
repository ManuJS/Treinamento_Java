package exercicio_orientacao_objeto;

/**
 * Created by emanu on 05/06/2017.
 */
public class Funcionario {

    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    String cargo = "gerente";

    public double recebeAumento(double aumento) {
        double novoSalario = this.salario + aumento;
        this.salario = novoSalario;

        return novoSalario;
    }

    public double calculaGanhoAnual() {

        double ganhoAnual = this.salario * 12;

        return ganhoAnual;

    }

    public boolean ehGerente() {

        if (this.cargo.equals("4")) {

            return true;
        } else return false;

    }

    public void mostra() {
        this.salario = 100;
        this.nome = "Manu";
        int aumento = 50;


        System.out.println("Nome Funcionario: " + nome
                + "\n Cargo: " + this.cargo
                + "\n Salario: " + this.salario
                + "\n Aumento: " + aumento
                + "\n Salario + aumento: " + this.recebeAumento(aumento)
                + "\n Ganho anual com aumento: " + this.calculaGanhoAnual());

    }
}
