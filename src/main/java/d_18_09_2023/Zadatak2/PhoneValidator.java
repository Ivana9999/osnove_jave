package d_18_09_2023.Zadatak2;

public class PhoneValidator extends Validator{

    private String brojTelefona;

    public PhoneValidator(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean containsLetterCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult validationResult = new ValidationResult(false);
        if(!(this.brojTelefona.startsWith("+"))) {
            validationResult.addError("Phone number must start with +");
        }

        if(this.brojTelefona.contains(" ")){
            validationResult.addError("Phone number cannot contain spaces");
        }

        if(containsLetterCharacter(this.brojTelefona)) {
            validationResult.addError("Phone number can only contain numbers");
        }
        return validationResult;
    }
}
