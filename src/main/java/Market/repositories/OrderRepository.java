package Market.repositories;

import Market.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements Repository<Order>{
    private final List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
    }


    @Override
    public void add(Order object) {
        orders.add(object);
    }

    @Override
    public Order get(int i) {
        return orders.get(i);
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }
}
