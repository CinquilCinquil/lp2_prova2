package IMD.UFRN.BR.modelo;

public class Pessoa {
	
	private String nome;
	private double salario;
	private ContaCorrente conta;
	private SeguroVida seguro;
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public ContaCorrente getConta() {
		return conta;
	}
	
	public SeguroVida getSeguro() {
		return seguro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	
	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
}