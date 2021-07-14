package hr.king.akademija.generator;

public class SpecificGenerator extends PasswordGenerator {

    private static final String ALLOWED_CHAR = "qwertzuiopasdfghjklyxcvbnm";

    @Override
    public String generatePassword(int size) {
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            passwordBuilder.append(generateAllowedString());
        }

        return passwordBuilder.toString();
    }

    private char generateAllowedString() {
        char character = '0';

        do {
            character = this.getRandomCharacter();
        } while (ALLOWED_CHAR.indexOf(character) < 0);

        return character;
    }

}
