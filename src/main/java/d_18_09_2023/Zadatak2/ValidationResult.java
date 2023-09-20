package d_18_09_2023.Zadatak2;

import java.util.ArrayList;

public class ValidationResult {
    protected boolean hasErros;
    protected ArrayList<String> errors;

    public ValidationResult(boolean hasErros) {
        this.hasErros = hasErros;
        this.errors = new ArrayList<>();
    }

    public boolean isHasErros() {
        return hasErros;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }
    public void addError (String errors) {
        this.errors.add(errors);
        this.hasErros =  true;
    }
    public void stampaj () {
        if (this.hasErros) {
            for (int i = 0; i < this.errors.size(); i++) {
                System.out.println(this.errors.get(i));
            }
        } else {
            System.out.println("No validation errors");
        }
    }
}
