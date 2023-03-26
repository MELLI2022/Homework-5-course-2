;

public class Main {
    public static void main(String[] args)  {
        boolean info = FilePassword.checkFile("sun_SUN123", "moon_MOON321", "moon_MOON321");
        if (info){
            System.out.println("Логин, пароль соответствуют формату");
        }else  {
            System.out.println("Логин, пароль не соответствуют формату");
        }

    }


    }







