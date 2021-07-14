package hr.king.akademija.generator;


public class BasicPasswordGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        String pass = "";

        for (int i = 0; i < size; i++) {
            pass += getRandomCharacter();
        }

        return pass;
    }

}
