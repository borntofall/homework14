package exeptions;

public class WrongPasswordExecption extends RuntimeException{

    private String password;
    private String confirmPassword;

    public WrongPasswordExecption(String password) {
        super("Некорретный пароль: %s".formatted(password));
        this.password = password;
    }

    public WrongPasswordExecption(String password, String confirmPassword) {
        super("Пароль: %s отличается от: %s".formatted(password,confirmPassword));
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
