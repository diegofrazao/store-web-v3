package br.edu.ifpb.padroes.storewebv3.facade;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;

import java.util.List;

public class ProductFacade {
    private final ProductRepository productRepository;

    public ProductFacade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAvailableProducts() {
        return productRepository.getProductList();
    }
}
