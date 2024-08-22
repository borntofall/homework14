package service;

import exeptions.WrongLoginExecption;
import exeptions.WrongPasswordExecption;

public class RegistrationService {

    private static final String VALID_SYMBOLS = "zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP1234567890_";

    public static void registration(String login, String password, String confirmPassword) {
        registrationLogin(login);
        registrationPassword(password, confirmPassword);

    }

    private static void registrationLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginExecption("Слишком длинный логин", login);
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginExecption("Некорректные символы логина", login);
            }
        }
    }

    private static void registrationPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExecption(password,confirmPassword);
        }
        if (password.length() > 20) {
            throw new WrongPasswordExecption(password);
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordExecption(password, confirmPassword);
            }
        }
    }

}
