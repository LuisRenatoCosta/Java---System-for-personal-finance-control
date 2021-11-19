package sistemaparacontroledeorcamentopessoal;

public class Pessoa {
    
    //Atributos
    private String nome;
    private String cpf;
    private int idade;
    
    //Método Construtor
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;}
    
    //Getters e Setters
    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
    public String getCpf() {
        return cpf;}
    public void setCpf(String cpf) {
        this.cpf = cpf;}
    public int getIdade() {
        return idade;}
    public void setIdade(int idade) {
        this.idade = idade;}
    
    //Método toString
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + '}';}
    
}
