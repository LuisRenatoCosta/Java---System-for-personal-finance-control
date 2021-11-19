package sistemaparacontroledeorcamentopessoal;

public class SistemaParaControleDeOrcamentoFinaneiroPessoal {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Victor", "567.935.948-94", 89);
        Pessoa p2 = new Pessoa("Paulo", "893.846.203-90", 23);
        Pessoa p3 = new Pessoa("Roberto", "672.936.012-83", 54);
        Pessoa p4 = new Pessoa("Marcelo", "738.927.329-77", 19);
        
        Conta cc1 = new ContaCorrente(p1, "5739");
        Conta cc2 = new ContaCorrente(p4, "3961");
        Conta cc3 = new ContaCorrente(p2, "7935");
        Conta cc4 = new ContaCorrente(p1, "9643");
        
        Conta cp1 = new ContaPoupanca(p3, "4830");
        Conta cp2 = new ContaPoupanca(p4, "0871");
        Conta cp3 = new ContaPoupanca(p2, "6203");
        Conta cp4 = new ContaPoupanca(p3, "8637");
        
        cc1.logar();
        Transacao t1 = new Transacao(p1, cc1, TipoOperacao.CREDITO, "01/08/2018", 15500, "Salário");
        Transacao t2 = new Transacao(p1, cc1, TipoOperacao.DEBITO, "17/12/2016", 3500, "Compra celular");
        
        cc4.logar();
        Transacao t3 = new Transacao(p1, cc4, TipoOperacao.DEBITO, "15/01/1995", 1250, "Shopping");
        Transacao t4 = new Transacao(p1, cc4, TipoOperacao.DEBITO, "12/03/2005", 225, "Comida");
        
        cc3.logar();
        Transacao t5 = new Transacao(p2, cc3, TipoOperacao.CREDITO, "17/11/2006", 25000, "Salário");
        Transacao t6 = new Transacao(p2, cc3, TipoOperacao.DEBITO, "04/04/2020", 230, "Transporte");
        
        cp3.logar();
        Transacao t7 = new Transacao(p2, cp3, TipoOperacao.DEBITO, "09/10/2019", 7800, "Aluguel");
        Transacao t8 = new Transacao(p2, cp3, TipoOperacao.DEBITO, "22/04/2001", 568, "Comida");
        
        cp1.logar();
        Transacao t9 = new Transacao(p3, cp1, TipoOperacao.CREDITO, "21/07/1998", 50000, "Salário");
        Transacao t10 = new Transacao(p3, cp1, TipoOperacao.DEBITO, "12/06/2010", 1200, "IPVA");
        
        cp4.logar();
        Transacao t11 = new Transacao(p3, cp4, TipoOperacao.DEBITO, "16/02/2000", 700, "Seguro carro");
        Transacao t12 = new Transacao(p3, cp4, TipoOperacao.DEBITO, "09/05/1999", 2900, "Condomínio + IPTU");
        
        cc2.logar();
        Transacao t13 = new Transacao(p4, cc2, TipoOperacao.CREDITO, "22/09/1995", 8700, "Salário");
        Transacao t14 = new Transacao(p4, cc2, TipoOperacao.DEBITO, "18/03/2011", 500, "Seguro carro");
        
        cp2.logar();
        Transacao t15 = new Transacao(p4, cp2, TipoOperacao.DEBITO, "23/12/1998", 1870, "Compra relógio");
        Transacao t16 = new Transacao(p4, cp2, TipoOperacao.DEBITO, "01/01/2002", 680, "Mensalidade clube");
        
        cc1.resumo();
        cc2.resumo();
        cc3.resumo();
        cc4.resumo();
        cp1.resumo();
        cp2.resumo();
        cp3.resumo();
        cp4.resumo();
        
    }
    
}
