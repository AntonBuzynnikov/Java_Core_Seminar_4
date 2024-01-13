package Market.Exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CountException  extends Exception{
    private int count;

    @Override
    public String getMessage() {
        return String.format("Вы ввели неверное количество товара: %d",count);
    }
}
