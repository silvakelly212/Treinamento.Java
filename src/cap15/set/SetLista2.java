package cap15.set;

import cap15.map.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetLista2 {


  public static void main(String[] args) {


    Set<Produto> produtos = new HashSet<>();

    Produto produto = new Produto();
    produto.setNome("Coco Cola");
    produto.setCategoria("Refrigerante");
    produto.setPreco(15.00);

    produtos.add(new Produto("Leito em pó", "Laticinios", 10.00));
    produtos.add(produto);
    produtos.add(new Produto("Carne moida", "Acougue", 30.00));
    produtos.add(new Produto("Negresco", "Bolacha", 5.90));
    produtos.add(new Produto("Alface", "Verdura", 3.00));

    produtos.remove(produto);

    produtos.removeIf(produto1 ->  produto1.getPreco() > 15.00);
    produtos.removeIf(produto1 ->  produto1.getNome() ==  "Negresco");
    produtos.removeIf(produto1 ->  produto1.getCategoria() == "Verdura");

    produtos.forEach(produto1 -> {
      if (produto1.getNome() == "Alface"){
        System.out.println(produto1);
        // return new Ha
      }
    });

  }


}
