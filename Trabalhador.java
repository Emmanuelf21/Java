
public class Trabalhador {
    private float salario;
    private String nome;

    public Trabalhador(){
        salario = 0.0f;
        nome = "sem nome!";
    }
    public Trabalhador(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public float getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String toString(){
        String relatorio = "";
        relatorio+= "O trabalhador "+getNome()+" tem o salário mensal de: "+getSalario()+ " e recebe por ano "+ calculaSalarioAnual();
        return relatorio;
    }
    public float calculaSalarioAnual(){
        return (getSalario()*13+getSalario()/3);
    }
}