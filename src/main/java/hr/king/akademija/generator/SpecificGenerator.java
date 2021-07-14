package hr.king.akademija.generator;

import java.util.Locale;

public class SpecificGenerator extends PasswordGenerator {

    private static final String LOWER_CASE_LETTTERS = "abcdefghijklmnopqrstuvwxyz" ;

    @Override
    public String generatePassword(int size) {
        String password = "";

        for(int i=0; i<size; i++) {
            password += generateAllowedChar();
        }

        return password;
    }

    private String generateAllowedChar() {
        String generatedChar;

        do{
            generatedChar = Character.toString(getRandomCharacter());
        }while(LOWER_CASE_LETTTERS.indexOf(generatedChar) < 0);

        return generatedChar.toLowerCase();
    }
}