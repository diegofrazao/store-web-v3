package br.edu.ifpb.padroes.storewebv3.visitor;

import br.edu.ifpb.padroes.storewebv3.domain.Book;
import br.edu.ifpb.padroes.storewebv3.domain.Eletronics;
import br.edu.ifpb.padroes.storewebv3.domain.Product;

public interface Visitor {
    void visit(Book book);
    void visit(Eletronics eletronics);
    void visit(Product product);
}
