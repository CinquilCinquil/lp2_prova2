package controle;

import IMD.UFRN.BR.modelo.Pessoa;
import IMD.UFRN.BR.modelo.ITributavel;
import java.util.List;

public class GeradorImpostoRenda
{
    private double TRIBUTO_SALARIO = 0.11;

    public double calculaValorTotalTributo(Pessoa pessoa)
    {
        return pessoa.getConta().calcularTributos() +
            pessoa.getSeguro().calcularTributos() +
            pessoa.getSalario() * this.TRIBUTO_SALARIO;
    }
}
