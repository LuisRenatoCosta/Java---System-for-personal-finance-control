package sistemaparacontroledeorcamentopessoal;

public abstract class Conta implements Logar{
    
    //Atributos
    protected Pessoa pessoa;
    protected String numConta;
    private float saldo;
    protected boolean status;
    private int transacao;

    //Método Construtor
    public Conta(Pessoa pessoa, String numConta) {
        this.pessoa = pessoa;
        this.numConta = numConta;
        this.saldo = 0;
        this.status = true;}
    
    
    //Getters e Setters
    public Pessoa getPessoa() {
        return pessoa;}
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;}
    public String getNumConta() {
        return numConta;}
    public void setNumConta(String numConta) {
        this.numConta = numConta;}
    public float getSaldo() {
        return saldo;}
    public void setSaldo(float saldo) {
        this.saldo = saldo;}
    public boolean getStatus() {
        return status;}
    public void setStatus(boolean status) {
        this.status = status;}
    public int getTransacao() {
        return transacao;}
    public void setTransacao(int transacao) {
        this.transacao = transacao;}
    
    
    //Método toString
    @Override
    public String toString() {
        return "Conta{" + "pessoa=" + pessoa + ", numConta=" + numConta + ", saldo=" + saldo + ", status=" + status + '}';}
    
    //Métodos complementares
    public void fecharConta(){
        if (this.getSaldo() == 0 && this.getStatus() == true) {
            System.out.println("-------------------- FECHAMENTO DE CONTA BANCÁRIA --------------------");
            System.out.println("Conta do cliente " + pessoa.getNome() + " de número " + numConta +  " fechada com sucesso.......");
            this.setStatus(false);
        } else {
            System.out.println("........Conta não pode ser encerrada........");}}
    
    public void resumo(){
        System.out.println("------ RESUMO DA CONTA " + this.getNumConta() + " ------");
        System.out.println("Cliente: " + pessoa.getNome() + "\nNúmero da Conta: " + this.getNumConta() + "\nNúmero de transferências: " + this.transacao + "\nSaldo em conta: " + this.getSaldo());
        System.out.println("---------------------------------");}
    
    @Override
    public abstract void logar();
}

