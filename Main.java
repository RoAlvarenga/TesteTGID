import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        List<Usuario> listaUsuario = new ArrayList<>();
        List<Produto> listaProduto = new ArrayList<>();
       

        Usuario usuario1 = new Usuario("Rodrigo","11111111111","rodrigo@email.com","senha123");
        Usuario usuario2 = new Usuario("Joao","11111111112","joao@email.com","senha123");
        Usuario usuario3 = new Usuario("Pedro","11111111113","pedro@email.com","senha123");
        Usuario usuario4 = new Usuario("Maria","11111111123","maria@email.com","senha123");
        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
        listaUsuario.add(usuario3);
        listaUsuario.add(usuario4);

        Produto produto1 = new Produto("Fone",1,29.99);
        Produto produto2 = new Produto("Celular",1,1029.99);
        Produto produto3 = new Produto("Teclado",1,129.99);
        Produto produto4 = new Produto("Mouse",1,139.99);
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto3);

        Compra.compra(usuario1,produto1);
        Compra.compra(usuario1,produto3);
        Compra.compra(usuario1,produto4);
        Compra.compra(usuario2,produto2);
        Compra.compra(usuario3,produto3);
        Compra.compra(usuario4,produto4);
        Compra.compra(usuario4,produto2);
        Compra.compra(usuario3,produto2);
        Compra.compra(usuario1,produto2);


        System.out.println("Usuarios:");
        for(Usuario usuario : listaUsuario){
            System.out.println(usuario.toString());
        }
        System.out.println("Produtos:");
        for(Produto produto : listaProduto){
            System.out.println(produto.toString());
        }
        System.out.println("Vendas:");
        for(Venda venda : Compra.listaVenda){
            System.out.println(venda.toString());
        }
        System.out.println("ItemVenda:");
        for(ItemVenda itemvenda : Compra.listaItemVenda){
            System.out.println(itemvenda.toString());
        }
    }
    
}
