package Market.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order {
    private Customer customer;
    private Product product;
    private int count;
}
