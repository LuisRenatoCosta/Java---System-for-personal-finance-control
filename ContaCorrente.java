package sistemaparacontroledeorcamentopessoal;

public class ContaCorrente extends Conta implements Logar{
    
    //Atributos
    private float limite;
    
    //Métodos complementares
    @Override
    public void logar(){
        System.out.println("Logando na conta corrente....");}

    public ContaCorrente(Pessoa pessoa, String numConta){
        super(pessoa, numConta);
        this.limite = 1000;}
        
    @Override
    public boolean getStatus() {
        return status;}
    @Override
    public void setStatus(boolean status) {
        this.status = status;}
    
}

