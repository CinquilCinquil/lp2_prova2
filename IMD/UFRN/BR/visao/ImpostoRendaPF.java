package visao;

import IMD.UFRN.BR.modelo.Pessoa;
import IMD.UFRN.BR.modelo.ContaCorrente;
import IMD.UFRN.BR.modelo.SeguroVida;
import IMD.UFRN.BR.dao.PessoaDAO;
import controle.GeradorImpostoRenda;

public class ImpostoRendaPF
{
    public static void main(String[] args)
    {
        // Criando e configurando instâncias de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setSalario(5000);
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setAgencia("1234");
        conta1.setNumero("567890");
        conta1.setSaldo(10000);
        pessoa1.setConta(conta1);
        SeguroVida seguro1 = new SeguroVida();
        seguro1.setNumero(1);
        seguro1.setBeneficiado("Maria");
        seguro1.setValor(200000);
        seguro1.setTaxa(0.02);
        pessoa1.setSeguro(seguro1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ana");
        pessoa2.setSalario(7000);
        ContaCorrente conta2 = new ContaCorrente();
        conta2.setAgencia("2345");
        conta2.setNumero("123456");
        conta2.setSaldo(15000);
        pessoa2.setConta(conta2);
        SeguroVida seguro2 = new SeguroVida();
        seguro2.setNumero(2);
        seguro2.setBeneficiado("Carlos");
        seguro2.setValor(300000);
        seguro2.setTaxa(0.02);
        pessoa2.setSeguro(seguro2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Pedro");
        pessoa3.setSalario(6000);
        ContaCorrente conta3 = new ContaCorrente();
        conta3.setAgencia("3456");
        conta3.setNumero("789012");
        conta3.setSaldo(12000);
        pessoa3.setConta(conta3);
        SeguroVida seguro3 = new SeguroVida();
        seguro3.setNumero(3);
        seguro3.setBeneficiado("Lucia");
        seguro3.setValor(250000);
        seguro3.setTaxa(0.02);
        pessoa3.setSeguro(seguro3);

        // Criando e preenchendo o DAO
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.cadastraPessoa(pessoa1);
        pessoaDAO.cadastraPessoa(pessoa2);
        pessoaDAO.cadastraPessoa(pessoa3);

        // Calculando os tributos
        GeradorImpostoRenda gerador = new GeradorImpostoRenda();
        double tributoPessoa1 = gerador.calculaValorTotalTributo(pessoa1);
        double tributoPessoa2 = gerador.calculaValorTotalTributo(pessoa2);
        double tributoPessoa3 = gerador.calculaValorTotalTributo(pessoa3);

        // Imprimindo os resultados
        System.out.println("Tributo para " + pessoa1.getNome() + ": " + tributoPessoa1);
        System.out.println("Tributo para " + pessoa2.getNome() + ": " + tributoPessoa2);
        System.out.println("Tributo para " + pessoa3.getNome() + ": " + tributoPessoa3);
    }
}
