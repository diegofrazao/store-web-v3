package br.edu.ifpb.padroes.storewebv3.command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;

public class CreateOrderCommand implements OrderCommand{

    private Order order;
    private final OrderFacade orderFacade;

    public CreateOrderCommand(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.orderFacade.createOrder(this.order);
    }
}
