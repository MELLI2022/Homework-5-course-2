import java.util.concurrent.ThreadLocalRandom;

public class  FilePassword {

   private FilePassword() {
    }
    public static boolean checkFile(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Логин не соответствует" );
        }
        if (password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не соответствует или не равен проверке");
        }

        Examination examination = new CharacterExamination();
        if (!examination.check(login)){
            throw new WrongLoginException("У логина не соответствуют символы");
       }
        if (!examination.check(password)){
            throw new WrongPasswordException("У пароля не соответствуют символы");
        }







   }

}
