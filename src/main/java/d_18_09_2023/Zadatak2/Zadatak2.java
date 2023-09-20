package d_18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        EmailValidator emailValidator = new EmailValidator("asdfasdfasdf");
        ValidationResult validator = emailValidator.validate();

        validator.stampaj();


        PasswordValidator passwordValidator = new PasswordValidator("botcamp");

        ValidationResult validationResult = passwordValidator.validate();

        validationResult.stampaj();


        PhoneValidator phoneValidator1 = new PhoneValidator("5a5 555 55");

        ValidationResult validatePhone = phoneValidator1.validate();

        validatePhone.stampaj();

    }
}
