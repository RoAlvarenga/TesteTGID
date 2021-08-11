import java.util.List;
import java.util.ArrayList;
public class Compra {

    public static int id = 1;
    public static List<Venda> listaVenda = new ArrayList<>();
    public static List<ItemVenda> listaItemVenda = new ArrayList<>();
    public static void compra(Usuario usuario,Produto produto){
        Venda venda = new Venda(id,usuario);
        ItemVenda itemvenda = new ItemVenda(venda,produto);
        listaVenda.add(venda);
        listaItemVenda.add(itemvenda);
        id++;

    }

    
}
