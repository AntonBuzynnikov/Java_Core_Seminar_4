package Market.Exceptions;

import Market.models.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerException extends Exception{
    private Customer customer;

    @Override
    public String getMessage() {
        return String.format("Покупателя %s не существует",customer);
    }
}
