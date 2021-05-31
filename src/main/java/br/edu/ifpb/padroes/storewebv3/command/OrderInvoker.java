package br.edu.ifpb.padroes.storewebv3.command;

import java.util.LinkedList;
import java.util.List;

public class OrderInvoker {
    private List<OrderCommand> commands = new LinkedList<>();

    public void addCommand(OrderCommand commands) {
        this.commands.add(commands);
    }

    public void remCommands(OrderCommand commands) {
        this.commands.remove(commands);
    }

    public void executeOrders() {
        for (OrderCommand orderCommand: commands) {
            orderCommand.execute();
        }
    }
}
