package hr.king.akademija.generator;

import java.util.ArrayList;

public class SpecificGenerator extends PasswordGenerator{

    @Override
    public String generatePassword(int size) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < size; i++){
            password.append(getRandomCharacter());
        }

        return password.toString().toLowerCase();
    }
}
