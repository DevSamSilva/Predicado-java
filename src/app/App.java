package app;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import model.ProdutoPredicado;

public class App {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.0));
        list.add(new Produto("Celular", 50.0));
        list.add(new Produto("Taclet", 350.50));
        list.add(new Produto("Hd", 80.90));

        list.removeIf(new ProdutoPredicado());

        for (Produto p : list) {
            System.out.println(p);
        }

    }
}
