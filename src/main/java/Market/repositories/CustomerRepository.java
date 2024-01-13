package Market.repositories;

import Market.models.Customer;
import Market.models.Gender;

import java.util.ArrayList;
import java.util.List;


public class CustomerRepository implements Repository<Customer>{
    private final List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
        customers.add(new Customer("Иван",25,"79999999999", Gender.MALE));
        customers.add(new Customer("Ольга",28,"79999999999", Gender.FEMALE));
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer get(int i) {
        return customers.get(i);
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}
