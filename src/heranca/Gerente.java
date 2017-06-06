package heranca;

/**
 * Created by emanu on 06/06/2017.
 */
public class Gerente extends Funcionario {

    int senha;
    int numeroDeFuncionariosGerenciados;

    public boolean autentica(int Senha) {
        if (this.senha == senha) {
            System.out.println("acesso permitido");
            return true;
        } else {
            System.out.println("acesso negado");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
//        return this.salario * 0.15 + this.salario;
        return  super.getBonificacao() + this.salario;
 }
}
