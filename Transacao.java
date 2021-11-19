package sistemaparacontroledeorcamentopessoal;

public class Transacao {
    
    //Atributos
    protected Pessoa pessoa;
    protected Conta conta;
    protected String data;
    protected float valor;
    protected String descricao;
    protected TipoOperacao tipoOperation;

    //Método Construtor
    public Transacao(Pessoa pessoa, Conta conta, TipoOperacao tipoOperacao, String data, float valor, String descricao){
        if (tipoOperacao == TipoOperacao.CREDITO && conta.getStatus() == true) {
            conta.setTransacao(conta.getTransacao() + 1);
            System.out.println("---------- TRANSAÇÃO DE NÚMERO " + conta.getTransacao() + " -----------");
            conta.setSaldo(conta.getSaldo() + valor);
            this.setDescricao(descricao);
            System.out.println("Nome: " + pessoa.getNome() + "\nNumero da Conta: " + conta.numConta + "\nData da transação: " + data + "\nTipo de Operação: " + tipoOperacao + "\nValor: " + valor + "\nDescrição: " + descricao);
            System.out.println("------- FIM DA TRANSAÇÃO DE NÚMERO " + conta.getTransacao() + " -------\n");}
        else if (tipoOperacao == TipoOperacao.DEBITO && conta.getStatus() == true){           
            conta.setTransacao(conta.getTransacao() + 1);
            System.out.println("---------- TRANSAÇÃO DE NÚMERO " + conta.getTransacao() + " -----------");
            conta.setSaldo(conta.getSaldo() - valor);
            setDescricao(descricao);
            System.out.println("Nome: " + pessoa.getNome() + "\nNumero da Conta: " + conta.getNumConta() + "\nData da transação: " + data + "\nTipo de Operação: " + tipoOperacao + "\nValor: " + valor + "\nDescrição: " + descricao);
            System.out.println("------- FIM DA TRANSAÇÃO DE NÚMERO " + conta.getTransacao() + " -------\n");}
        else {
            System.out.println("Conta fechada. Não é possível fazer transação");}}
    
    //Getters e Setters
    public Conta getConta() {
        return conta;}
    public void setConta(Conta conta) {
        this.conta = conta;}
    public String getData() {
        return data;}
    public void setData(String data) {
        this.data = data;}
    public float getValor() {
        return valor;}
    public void setValor(float valor) {
        this.valor = valor;}
    public String getDescricao() {
        return descricao;}
    public void setDescricao(String descricao) {
        this.descricao = descricao;}
    public TipoOperacao getTipoOperation() {
        return tipoOperation;}
    public void setTipoOperation(TipoOperacao tipoOperation) {
        this.tipoOperation = tipoOperation;}
    
    //Método toString
    @Override
    public String toString() {
        return "Transacao{" + "conta=" + conta + ", data=" + data + ", valor=" + valor + ", descricao=" + descricao + ", tipoOperation=" + tipoOperation + '}';}
    
}
