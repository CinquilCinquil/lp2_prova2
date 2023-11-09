package IMD.UFRN.BR.modelo;

public class ContaCorrente {
	
	private String agencia;
	private	String numero;
	private double saldo;
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean transferir(double valor, ContaCorrente cc) {
		return false;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}