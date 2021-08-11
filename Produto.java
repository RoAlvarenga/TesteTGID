public class Produto {
    public String nome;
    public int quantidade;
    public double preco;
    //Construtor do objeto Produto
    public Produto(String nome,int quantidade,double preco){
        this.nome=nome;
        this.quantidade = quantidade;
        this.preco=preco;
    }
    public String toString(){
        return "Nome: "+nome +" Quantidade : "+quantidade + " Preco: " + preco;
    }
}
