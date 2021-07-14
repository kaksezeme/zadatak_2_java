package hr.king.akademija.generator;

import static java.lang.Character.isLowerCase;

public class SpecificGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        StringBuilder lowercasepw = new StringBuilder();
        int counter = size;
        while (counter > 0) {
            char letter = this.getRandomCharacter();
            if (isLowerCase(letter)) {
                lowercasepw.append(letter);
                counter--;
            }
        }

        return lowercasepw.toString();
    }
}
