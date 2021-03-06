import java.util.List;
import java.util.ArrayList;
public class Main {
    public static List<Usuario> listaUsuario = new ArrayList<>();
    public static List<Produto> listaProduto = new ArrayList<>();
    public static List<Venda> listaVenda = new ArrayList<>();
    public static List<ItemVenda> listaItemVenda = new ArrayList<>();
    public static void main(String[] args){
        //Criando lista para armazenar os objetos.
        List<Usuario> listaUsuario = new ArrayList<>();
        List<Produto> listaProduto = new ArrayList<>();
       
        //Criando alguns usuarios
        Usuario usuario1 = new Usuario("Rodrigo","11111111111","rodrigo@email.com","senha123","Avenida Paulista");
        Usuario usuario2 = new Usuario("Joao","11111111112","joao@email.com","senha123","Avenida Santo Amaro");
        Usuario usuario3 = new Usuario("Pedro","11111111113","pedro@email.com","senha123","Avenida Adolfo Pinheiro");
        Usuario usuario4 = new Usuario("Maria","11111111123","maria@email.com","senha123","Avenida Ibirapuera");
        //adiciona os usuarios na lista
        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
        listaUsuario.add(usuario3);
        listaUsuario.add(usuario4);
        //Criando alguns produtos
        Produto produto1 = new Produto(1,"Fone",10,29.99);
        Produto produto2 = new Produto(2,"Celular",15,1029.99);
        Produto produto3 = new Produto(3,"Teclado",5,129.99);
        Produto produto4 = new Produto(4,"Mouse",3,139.99);
        //adiciona os produtos na lista
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);
        //Chama o metodo compra para realizar a venda
        compra(usuario1,produto1);
        compra(usuario1,produto3);
        compra(usuario1,produto4);
        compra(usuario2,produto2);
        compra(usuario3,produto3);
        compra(usuario4,produto4);
        compra(usuario4,produto2);
        compra(usuario3,produto2);
        compra(usuario1,produto2);


        //Exibe os produtos, com a quantidade atualizada.
        System.out.println("Produtos:");
        for(Produto produto : listaProduto){
            System.out.println(produto.toString());
        }
        //Exibe as vendas que foram realizadas.
        System.out.println("Vendas:");
        for(Venda venda : listaVenda){
            System.out.println(venda.toString());
        }
        //Exibe o produto de cada venda realizada.
        System.out.println("ItemVenda:");
        for(ItemVenda itemvenda : listaItemVenda){
            System.out.println(itemvenda.toString());
        }
    }
    public static int id = 1;
    //Metodo para realizar a compra
    static void compra(Usuario usuario,Produto produto){
        //Cria um objeto venda que liga o id com o usuario.
        Venda venda = new Venda(id,usuario);
        //Liga a venda com o produto vendido.
        ItemVenda itemvenda = new ItemVenda(venda,produto);
        listaVenda.add(venda);
        listaItemVenda.add(itemvenda);
        //Apos a venda ser realizada,diminui a quantidade em estoque.
        produto.quantidade -=1;
        id++;

    }
    
}
