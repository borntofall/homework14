import exeptions.WrongLoginExecption;
import exeptions.WrongPasswordExecption;
import service.RegistrationService;

import static service.RegistrationService.registration;

public class Main {
    public static void main(String[] args) {

        try {
            registration("111", "asdWAep_1", "asdWAep_1");
            System.out.println("Успешно");
        } catch (WrongPasswordExecption e) {
            System.out.println(e.getMessage());
        } catch (WrongLoginExecption a) {
            System.out.println(a.getMessage());
        }


    }
}