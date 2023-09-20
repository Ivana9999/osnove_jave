package d_18_09_2023.Zadatak2;

public class EmailValidator extends Validator{
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        if (this.email.contains("@") && (this.email.endsWith(".com") || this.email.endsWith(".net"))) {
            return new ValidationResult(false);
        } else {
            ValidationResult validationResult = new ValidationResult(true);
            validationResult.addError("Email is invalid");
            return validationResult;
        }
    }
}
