package Market.services;

import Market.models.Order;
import Market.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class OrderService implements Service<Order>{
    private final OrderRepository orderRepository;


    @Override
    public Order get(Order tmp) {
        List<Order> orders = orderRepository.getAll();
        if(orders.contains(tmp)) return tmp;
        return null;
    }

    @Override
    public void add(Order object) {
        orderRepository.add(object);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }

}
