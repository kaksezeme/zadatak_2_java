package hr.king.akademija.generator;


public class BasicPasswordGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        String password = "";
        for(int i = 0; i < size; i++){
            password += getRandomCharacter();
        }

        return password;
    }

}
