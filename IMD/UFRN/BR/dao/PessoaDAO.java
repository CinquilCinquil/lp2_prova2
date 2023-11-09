package IMD.UFRN.BR.dao;

import java.util.ArrayList;
import IMD.UFRN.BR.modelo.Pessoa;

public class PessoaDAO {
	
	ArrayList<Pessoa> pessoas;
	
	public PessoaDAO()
	{
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	public void removerPessoa(Pessoa p) {
		pessoas.remove(p);
	}
	
	public void listaPessoas() {
		
		for (Pessoa p : pessoas)
		{
			System.out.println(p.getNome());
		}
		
	}
	
	public double CalcularTributosPessoas() {
		return 0.0;
	}
	
	public void imprimeImpostoTotal() {
		
		double valorTotal = 0.0, maiorImposto = 0.0, maiorSeguro = 0.0;
		Pessoa pessoaMaiorImposto = null, pessoaMaiorSeguro = null;
		
		for (Pessoa p : pessoas)
		{
			double imposto = p.getSalario() * 0.11;
			double seguro = p.getSeguro().getValor();
			
			valorTotal += imposto;
			
			// Achando a pessoa com o maior imposto
			if (maiorImposto < imposto)
			{
				pessoaMaiorImposto = p;
				maiorImposto = imposto;
			}
			
			// Achando a pessoa com o maior seguro
			if (maiorSeguro < seguro)
			{
				pessoaMaiorSeguro = p;
				maiorSeguro = seguro;
			}
		}
		
		System.out.println("Imposto total: " + valorTotal);
		System.out.println("Pessoa que pagará o maior imposto: " + pessoaMaiorImposto.getNome());
		System.out.println("Pessoa com o maior seguro: " + pessoaMaiorSeguro.getNome());
	}
	
}