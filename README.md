Teste TGID;

Desenvolvido 5 classes. Sendo elas Usuario,Produto,Venda,ItemVenda e o Main.
Classe Venda liga o usuario com o id da venda. Classe ItemVenda liga o id da venda com o produto vendido.
A classe Compra cria o objeto venda e itemvenda, baseado no usuario e produto recebido.
Na classe main foi criado alguns usuarios e produtos, que depois foram usados no metodo compra().
O metodo compra cria um objeto da classe Venda, depois usa esse objeto para criar um objeto da classe ItemVenda. Após a compra ser realizada, a quantidade em estoque daquele produto é diminuida.