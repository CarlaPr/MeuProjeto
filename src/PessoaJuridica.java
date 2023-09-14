
package testepessoa;
    

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, int idade) {
        //super significa super classe que veio da classe Pessoa.
        super(nome, idade);
        this.cnpj = cnpj;
    }
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void imprime(){
        System.out.println(
        getNome()+ " " +
        getIdade()+" "+
        cnpj);
    }
    
    public PessoaJuridica(String n, int i, String cj){
        setNome(n);
        setIdade(i);
        cnpj = cj;  
    
    }
}
