package Vezbanje;

public class Vezba3 {
    public static void main(String[] args) {

        String file = "profile-image.log";
        int size = 25;
        int downloadSpeed = 3;

        System.out.println( "File: " + file );
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download speed:" + downloadSpeed + "Mb/s");
        System.out.println("Estimated time: " + size / downloadSpeed + "s");


    }
}
