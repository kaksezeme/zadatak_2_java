package hr.king.akademija.generator;


public class BasicPasswordGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            passwordBuilder.append(this.getRandomCharacter());
        }

        return passwordBuilder.toString();
    }

}
