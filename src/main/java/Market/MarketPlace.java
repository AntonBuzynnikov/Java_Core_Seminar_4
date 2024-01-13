package Market;

import Market.Exceptions.CountException;
import Market.Exceptions.CustomerException;
import Market.Exceptions.ProductException;
import Market.models.Customer;
import Market.models.Gender;
import Market.models.Order;
import Market.models.Product;
import Market.repositories.CustomerRepository;
import Market.repositories.OrderRepository;
import Market.repositories.ProductRepository;
import Market.services.*;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MarketPlace {
    private static final ProductRepository productRepository = new ProductRepository();
    private static final ProductService productService = new ProductService(productRepository);
    private static final CustomerRepository customerRepository = new CustomerRepository();
    private static final CustomerService customerService = new CustomerService(customerRepository);
    private static final OrderRepository orderRepository = new OrderRepository();
    private static final OrderService orderService = new OrderService(orderRepository);
    private static Order buy(Customer customer, Product product, int count) throws CustomerException, ProductException, CountException {
        if(!ValidService.validCustomer(customer, customerService)) throw new CustomerException(customer);
        if(!ValidService.validProduct(product, productService)) throw new ProductException(product.getName());
        if(!ValidService.validCount(count)) throw new CountException(count);
        return new Order(customer, product, count);
    }
    private static void addToOrders(Customer customer, Product product, int count) throws CustomerException, CountException, ProductException {
        orderService.add(buy(customer,product,count));
        System.out.println("Заказ совершен! № Заказа: " + orderService.getAll().size());
    }

    public static void main(String[] args) {
        Map<Integer, List<Object>> info = new HashMap<>();
        info.put(0,List.of(customerService.getAll().get(0),productService.getAll().get(3), 4));
        info.put(1,List.of(customerService.getAll().get(0),productService.getAll().get(3), 4));
        info.put(2,List.of(customerService.getAll().get(0),productService.getAll().get(3), 4));
        info.put(3,List.of(customerService.getAll().get(0),productService.getAll().get(3), -5));
        info.put(4,List.of(customerService.getAll().get(0),productService.getAll().get(3), 90));
        info.put(5,List.of(new Customer("Михаил",30,"78888888888", Gender.MALE),productService.getAll().get(3), 4));
        info.put(6,List.of(customerService.getAll().get(0),new Product("Компьютер",50000.0), 4));
        info.put(7,List.of(new Customer("Афанасий",65,"79999998888",Gender.MALE),new Product("Компьютер",50000.0), -1));
        for(List<Object> o: info.values()) {
            try {
                addToOrders((Customer) o.get(0), (Product) o.get(1), (Integer) o.get(2));
            } catch (CountException e) {
                System.out.println(e.getMessage());
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            }
        }

        CongratService.congratulation(1,1,customerService);
        CongratService.congratulation(23,2,customerService);
        CongratService.congratulation(8,3,customerService);
        CongratService.congratulation(10,1,customerService);

    }

}
