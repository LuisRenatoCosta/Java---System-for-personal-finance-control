package sistemaparacontroledeorcamentopessoal;

public class ContaPoupanca extends Conta{
    
    //Atributos
    private float juros;
    
    //Método Construtor
    public ContaPoupanca(Pessoa pessoa, String numConta){
        super(pessoa, numConta);
        this.juros = (float) 0.005;}
    
    //Getters e Setters
    public float getJuros() {
        return juros;
    }
    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public boolean getStatus() {
        return status;
    }
    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos complementares
    @Override
    public void logar(){
        System.out.println("Logando na conta poupança....");
    }
    
    
}
