package Market.repositories;

import Market.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product>{
    private final List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<Product>();
        products.add(new Product("Чайник",2000.0));
        products.add(new Product("Блендер",1500.0));
        products.add(new Product("Пылесос",5000.0));
        products.add(new Product("Телефон",25000.0));
        products.add(new Product("Часы",10000.0));
    }
    public void add(Product product){
        products.add(product);
    }
    public Product get(int i){
        return products.get(i);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
