package exeptions;

public class WrongPasswordExecption extends RuntimeException{

    private String password;
    private String confirmPassword;

    public WrongPasswordExecption(String password) {
        super("Некорретный пароль");
        this.password = password;
    }

    public WrongPasswordExecption(String password, String confirmPassword) {
        super("Введенные пароли отличаются");
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }
}
