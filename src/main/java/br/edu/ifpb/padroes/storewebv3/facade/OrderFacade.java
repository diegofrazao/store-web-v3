package br.edu.ifpb.padroes.storewebv3.facade;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;

import java.util.List;

public class OrderFacade {
    private OrderService orderService;

    public OrderFacade(OrderService orderService) {
        this.orderService  = orderService;
    }

    public void createOrder (Order order) {
        this.orderService.createOrder(order);
    }

    public List<Order> listOrders() {
        return orderService.listOrders();
    }
}
