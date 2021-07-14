package hr.king.akademija.generator;

import java.util.ArrayList;

public class SpecificGenerator extends PasswordGenerator{

    @Override
    public String generatePassword(int size) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < size; i++){
            Character character = getRandomCharacter();
            if (Character.isLowerCase(character))
                password.append(getRandomCharacter());
            else
                i--;
        }

        return password.toString();
    }
}
