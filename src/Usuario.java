public class Usuario {
    private String nome;
    private double salario;

    public Usuario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    
}
