package IMD.UFRN.BR.dao;

public class PessoaDAO {
	
	ArrayList<Pessoa> pessoas;
	
	public PessoaDAO()
	{
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastrarPessoa(Pessoa p);
	public void removerPessoa(Pessoa p);
	public void listarPessoas();
	public void calcularTributosPessoas();
	public void imprimeImpostoTotal();
	
}