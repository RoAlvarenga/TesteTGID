public class Usuario {
    private String nome;
    private String CPF;
    private String email;
    private String senha;
    //Construtor do objeto Usuario
    public Usuario(String nome,String CPF,String email,String senha){
        this.nome = nome;
        this.CPF= CPF;
        this.email = email;
        this.senha=senha;
    }
    public String toString(){
        return "Nome: "+ nome + " CPF: "+CPF +" Email: "+email+" Senha: "+senha;
    }   
}
