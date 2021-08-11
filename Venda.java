public class Venda {
    public int id;
    private Usuario usuario;
    //Construtor do objeto venda
    public Venda(int id, Usuario usuario){
        this.id = id;
        this.usuario=usuario;
    }
    public String toString(){
        return "ID: "+ id+ " Usuario: "+usuario;
    }
}
