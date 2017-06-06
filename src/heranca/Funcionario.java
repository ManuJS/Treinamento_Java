package heranca;

/**
 * Created by emanu on 06/06/2017.
 */
public class Funcionario {

   protected String nome;
    protected String departamento;
    protected double salario;
    protected String dataEntrada;
    protected String rg;

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDepartamento() {
        return departamento;
    }

    protected void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected String getDataEntrada() {
        return dataEntrada;
    }

    protected void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    protected String getRg() {
        return rg;
    }

    protected void setRg(String rg) {
        this.rg = rg;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }
}
