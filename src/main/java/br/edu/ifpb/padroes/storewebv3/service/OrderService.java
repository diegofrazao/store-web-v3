package br.edu.ifpb.padroes.storewebv3.service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.OrderItem;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.OrderRepository;
import br.edu.ifpb.padroes.storewebv3.visitor.DiscountProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();

    public void createOrder(Order order) {
        order.setProcessed(true);
        orderRepository.add(order);

        for (OrderItem item: order.getItems()) {
            Product product = item.getProduct();
            product.accept(new DiscountProduct());
        }
    }

    public List<Order> listOrders() {
        return orderRepository.listOrders() ;
    }

}
