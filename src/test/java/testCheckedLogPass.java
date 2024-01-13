import Example_1.CheckLoginPassword;
import WrongExceptions.WrongLoginException;
import WrongExceptions.WrongPasswordException;

import java.util.Arrays;

public class testCheckedLogPass {
    public static void main(String[] args) {
        String[][] users = {
                {"user123","qwerty","qwerty"},
                {"user12345678987654321","qwerty","qwerty"},
                {"user1234","qwerty","qwerty1"},
                {"user12","qwertyuiopasdfghjklzx","qwertyuiopasdfghjklzx"},
                {"user12345","qwertyuiopasdfghjklzxc","qwertyuiopasdfghjklzx"},
                {"user1234567654312ytrewq","098765432123456789098765","qwertyuiopasdfghjklzxc"}
        };
        for (String[] user : users) {
            try {
                System.out.println(CheckLoginPassword.checkedLoginPassword(user[0], user[1], user[2]));
            } catch (WrongLoginException e) {
                e.printStackTrace();
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
