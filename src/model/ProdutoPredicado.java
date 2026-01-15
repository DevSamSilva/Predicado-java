package model;

import java.util.function.Predicate;

public class ProdutoPredicado implements Predicate<Produto> {

    @Override
    public boolean test(Produto p) {
        return p.getPreco() >= 100.0;
    }
}
