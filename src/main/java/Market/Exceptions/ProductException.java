package Market.Exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductException extends Exception{
    private String productName;

    @Override
    public String getMessage() {
        return String.format("Товара %s не существует",productName);
    }
}
