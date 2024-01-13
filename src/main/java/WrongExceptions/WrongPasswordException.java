package WrongExceptions;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class WrongPasswordException extends Exception{
    private int currentLength;
    private boolean matchCorrect;

    @Override
    public String getMessage() {
        boolean badLength = currentLength <= 20;
        return String.format("Your password has an %scorrect length%s %d. Password %smatch the confirmation",
                ((badLength) ? "" : "in"),
                ((badLength) ? "" : ", excepted > 20, given"),
                currentLength,
                (matchCorrect) ? "" : "doesn't ");
    }
}
