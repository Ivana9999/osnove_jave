package d_18_09_2023.Zadatak2;

public class PasswordValidator extends Validator{
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean containsUpperCaseCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return true;
            }
        }

        return false;
    }
    public  boolean containsNumber(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i)))
                return true;
        }
        return false;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult result = new ValidationResult(false);

        if (!(this.password.contains("@") || this.password.contains("#") || this.password.contains("/") || this.password.contains("*"))) {
             result.addError("Password must contain at least one special character @, # or *");
        }
        if (this.password.length() < 8 ) {
            result.addError("Password must be minimum 8 characters");
        }
        if (!containsUpperCaseCharacter(this.password)) {
            result.addError("Password must contain at least one uppercase letter");
        }
        if (!containsNumber(this.password)) {
            result.addError("Password must contain at least one digit");
        }

        return result;
    }
}
