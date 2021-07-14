package hr.king.akademija.generator;

public class SpecificGenerator extends PasswordGenerator {
    @Override
    public String generatePassword(int size) {

        StringBuilder password = new StringBuilder();

        for(int i = 0; i< size; i++){
            Character character = this.getRandomCharacter();
            if(!Character.isLetter(character)){
                i--;
                continue;
            }
            else {
                password.append(character.toString().toLowerCase());
            }
        }

        return password.toString();
    }

}
