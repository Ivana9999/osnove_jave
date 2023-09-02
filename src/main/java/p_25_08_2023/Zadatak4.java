package p_25_08_2023;

public class Zadatak4 {
//    Napisati funkciju koja stampa zbir, razliku,
//   proizvod i kolicnik za dva prosledjena broja.
//    Brojevi su ulazni parametri funkcije. U
//    gravnom programu pozvati nekoliko puta funkciju sa
//    razlicitim prosledjenim vrednostima.

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        printResult(a, b);

    }


    public static void printResult (int a, int b ){
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("zbir " + sum);
        System.out.println("razlika " + difference);
        System.out.println("proizvod " + product);
        System.out.println("kolicnik " + quotient);


    }
    }

