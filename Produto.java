
public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome,int quantidade,double preco){
        this.nome=nome;
        this.quantidade = quantidade;
        this.preco=preco;
    }
    public String toString(){
        return "Nome: "+nome +" Quantidade : "+quantidade + " Preço: " + preco;
    }
}
