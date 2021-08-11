public class ItemVenda {
    private Venda venda;
    private Produto produto;
    //Construtor do Objeto ItemVenda
    public ItemVenda(Venda venda,Produto produto){
        this.venda=venda;
        this.produto=produto;

    }
    public String toString(){
        return "ID Venda: "+venda.id +" "+produto.nome +" Preço: "+produto.preco;
    }
}
