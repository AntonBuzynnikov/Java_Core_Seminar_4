package Example_1;

import WrongExceptions.WrongLoginException;
import WrongExceptions.WrongPasswordException;

public class CheckLoginPassword {
    private String login;
    private String password;
    private String confirmPassword;
    public static boolean checkedLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return checkedLogin(login) && checkedPassword(password, confirmPassword);
    }

    private static boolean checkedLogin(String login) throws WrongLoginException {
        if(login.length()>=20){
            throw new WrongLoginException(login.length());
        }else {
            return true;
        }
    }

    private static boolean checkedPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(checkedLengthPassword(password) && checkedLengthConfirmPassword(confirmPassword) && password.equals(confirmPassword)){
            return true;
        } else {
            throw new WrongPasswordException(password.length(),password.equals(confirmPassword));
        }
    }

    private static boolean checkedLengthPassword(String password){
        return password.length() <= 20;
    }

    private static boolean checkedLengthConfirmPassword(String confirmPassword){
        return confirmPassword.length() <= 20;
    }
}
