package controle;

import IMD.UFRN.BR.modelo.Pessoa;
import IMD.UFRN.BR.modelo.ITributavel;
import java.util.List;

public class GeradorImpostoRenda
{
    private double TRIBUTO_SALARIO = 0.11;
	private double totalTributo = 0.0;

    public double calculaValorTotalTributo(Pessoa pessoa)
    {
		totalTributo = pessoa.getConta().calcularTributos() +
            pessoa.getSeguro().calcularTributos() +
            pessoa.getSalario() * this.TRIBUTO_SALARIO;
			
        return totalTributo;
    }
	
	public double getTotalTributo() {
		return totalTributo;
	}
}
