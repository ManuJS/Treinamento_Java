package heranca;

/**
 * Created by emanu on 06/06/2017.
 */
public class ControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
