public class Usuario {
    private String nome;
    private String CPF;
    private String email;
    private String senha;
    private String endereco;
    //Construtor do objeto Usuario
    public Usuario(String nome,String CPF,String email,String senha,String endereco){
        this.nome = nome;
        this.CPF= CPF;
        this.email = email;
        this.senha=senha;
        this.endereco=endereco;

    }
    
    public String toString(){
        return "Nome: "+ nome + " CPF: "+CPF + " Endereco: "+endereco;
    }   
}
