package Market.services;

import Market.models.Product;
import Market.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductService implements Service<Product>{
    private final ProductRepository productRepository;


    @Override
    public Product get(Product tmp) {
        List<Product> products = productRepository.getAll();
        if(products.contains(tmp)) return tmp;
        return null;
    }

    @Override
    public void add(Product object) {
        productRepository.add(object);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
