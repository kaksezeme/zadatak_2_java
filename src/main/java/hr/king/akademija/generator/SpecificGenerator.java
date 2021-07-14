package hr.king.akademija.generator;

import java.util.Locale;

public class SpecificGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        String password = "";

        for(int i=0; i<size; i++) {
            password += Character.toString(getRandomCharacter()).toLowerCase();
        }

        return password;
    }
}
