package exeptions;

public class WrongLoginExecption extends RuntimeException {

    private String login;

    public WrongLoginExecption(String login) {
        super("Некорретный логин: %s".formatted(login));
        this.login = login;
    }

    public WrongLoginExecption(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
