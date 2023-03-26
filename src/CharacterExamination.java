public class CharacterExamination implements Examination{
    private  static final String ALLOWED_CHARACTERS = "0123456789_ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuwxyz";
    @Override
    public boolean check (String a){
        char[] chars = a.toCharArray();
        //for (int i = 0; i < chars.length; i++){
                for (char aChar : chars) {
            if (ALLOWED_CHARACTERS.contains(Character.toString(aChar))) ;
            {
                return true;
            }
        }
        return false;
    }
}
