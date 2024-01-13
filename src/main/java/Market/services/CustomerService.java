package Market.services;

import Market.models.Customer;
import Market.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class CustomerService implements Service<Customer>{
    private final CustomerRepository customerRepository;

//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Override
    public Customer get(Customer tmp) {
        List<Customer> customers = customerRepository.getAll();
        if(customers.contains(tmp)) return tmp;
        return null;
    }

    @Override
    public void add(Customer object) {
        customerRepository.add(object);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
}
