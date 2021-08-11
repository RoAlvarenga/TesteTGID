public class Produto {
    public String nome;
    public int quantidade;
    public double preco;
    public int id;
    //Construtor do objeto Produto
    public Produto(int id,String nome,int quantidade,double preco){
        this.id = id;
        this.nome=nome;
        this.quantidade = quantidade;
        this.preco=preco;
    }
    public String toString(){
        return "ID: "+id+" Nome: "+nome +" Quantidade : "+quantidade + " Preco: " + preco;
    }
}
