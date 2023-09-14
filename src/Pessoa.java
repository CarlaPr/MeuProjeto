package testepessoa;

public class Pessoa {
    
    //atributos
    private String nome;
    private int idade;
        
    public Pessoa(){
        
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int i){
        if (i>=0){
            this.idade = i;
        }
    }
    
    public int getIdade(){
        return idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        if (idade>=1){
            this.idade = idade;
        }
    }
    
    public void imprime(){
        System.out.println(nome+" "+idade);
    }
    
}
