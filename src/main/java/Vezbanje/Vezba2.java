package Vezbanje;



public class Vezba2 {
    public static void main(String[] args) {

        String nazivFajla = "profile-image.png";
       double velicinaOriginalnogFajla = 7.0;
       double velicinaSkinutogDelaFajla = 2.0;
        System.out.println(nazivFajla + " " + velicinaOriginalnogFajla + "Mb/" + velicinaSkinutogDelaFajla + "Mb" );
        System.out.println("*****************************");
        System.out.println("***********" + (velicinaSkinutogDelaFajla/velicinaOriginalnogFajla * 100 ) + "%");
        System.out.println("*****************************");

    }
}
