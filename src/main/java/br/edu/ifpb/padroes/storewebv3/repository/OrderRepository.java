package br.edu.ifpb.padroes.storewebv3.repository;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orderList = new ArrayList<>();

    public List<Order> listOrders() {
        return orderList;
    }

    public void add(Order element) {
        orderList.add(element);
    }

    public void remove(Order product) {
        orderList.remove(product);
    }

}
