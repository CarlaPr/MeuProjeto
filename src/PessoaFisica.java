
package testepessoa;


public class PessoaFisica extends Pessoa {
    
    private String cpf;

    public PessoaFisica(String cpf, String nome, int idade) {
        //super significa super classe que veio da classe Pessoa.
        super(nome, idade);
        this.cpf = cpf;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void imprime(){
        System.out.println(
        getNome()+ " " +
        getIdade()+" "+
        cpf );
    }
    
    public PessoaFisica(String n, int i, String c){
        setNome(n);
        setIdade(i);
        cpf = c;  
    }
    
}
