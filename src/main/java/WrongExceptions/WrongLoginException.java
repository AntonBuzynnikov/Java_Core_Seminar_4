package WrongExceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class WrongLoginException extends Exception{
    private int currentLength;

    @Override
    public String getMessage() {
        return String.format("Your login has an incorrect length," +
                "the current length is %d",currentLength);
    }
}
