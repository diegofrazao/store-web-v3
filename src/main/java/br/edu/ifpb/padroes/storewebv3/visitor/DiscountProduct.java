package br.edu.ifpb.padroes.storewebv3.visitor;

import br.edu.ifpb.padroes.storewebv3.domain.Book;
import br.edu.ifpb.padroes.storewebv3.domain.Eletronics;
import br.edu.ifpb.padroes.storewebv3.domain.Product;

public class DiscountProduct implements Visitor{
    private Double DISCOUNT_BOOK = 0.5;
    private Double DISCOUNT_ELETRONICS = 0.3;

    @Override
    public void visit(Book book) {
        book.setPrice((long)(book.getPrice() * DISCOUNT_BOOK));
    }

    @Override
    public void visit(Eletronics eletronics) {
        eletronics.setPrice((long)(eletronics.getPrice() * DISCOUNT_ELETRONICS));
    }

    @Override
    public void visit(Product product) {}
}
