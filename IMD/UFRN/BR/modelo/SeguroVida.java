package IMD.UFRN.BR.modelo;

public class SeguroVida implements ITributavel {
	
	private int numero;
	private String beneficiado;
	private double valor, taxa;
	
	public double calcularTributos() {
		return 31.5;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getBeneficiado() {
		return beneficiado;
	}
	
	public double getValor() {
		return valor;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setBeneficiado(String beneficiado) {
		this.beneficiado = beneficiado;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}