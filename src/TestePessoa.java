package testepessoa;

public class TestePessoa {

    
    public static void main(String[] args) {
       
       PessoaFisica pf = new PessoaFisica(
            "123.987",
            "Carla",
             20);
       
       PessoaJuridica pj = new PessoaJuridica (
            "898.098",
            "Giovanna",
            18);
       
       Pessoa [] vet = 
               new Pessoa[2];
       vet [0] = pf;
       vet [1] = pj;
       
       for (int cont=0; cont<2; cont++){
           vet[cont].imprime();
       }
    }
}
