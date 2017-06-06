package exercicio_orientacao_objeto;

/**
 * Created by emanu on 05/06/2017.
 */
public class Funcionario {

    public String nome;
    public String departamento;
    public double salario;
    public String dataEntrada;
    public String rg;
    public String cargo = "gerente";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

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
