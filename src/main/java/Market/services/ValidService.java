package Market.services;

import Market.Exceptions.CountException;
import Market.Exceptions.CustomerException;
import Market.Exceptions.ProductException;
import Market.models.Customer;
import Market.models.Product;

public class ValidService {
    public static boolean validCustomer(Customer customer, CustomerService customerService) throws CustomerException {
        if(customerService.get(customer)==null) throw new CustomerException(customer);
        return true;
    }
    public static boolean validProduct(Product product, ProductService productService) throws ProductException {
        if(productService.get(product)==null) throw new ProductException(product.getName());
        return true;
    }
    public static boolean validCount(int count) throws CountException {
        if(count < 0 || count > 60) throw new CountException(count);
        return true;
    }
}
