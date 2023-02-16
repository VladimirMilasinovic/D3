package Zadatak;

import java.util.Scanner;

public class DrugiCasZadatakTri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kada ste krenuli da radite");
        int radite = sc.nextInt();
        System.out.println("Unesite godine radnog iskustva");
        int iskustvo = sc.nextInt();

        if (iskustvo <= 4) {
            System.out.println("Ti si junior programer");
            if (iskustvo > 4 && iskustvo < 8) {
                System.out.println("Ti si senior programer");
                if (iskustvo > 8) {
                    System.out.println("Vi ste direktor");
                }
            }
        }
    }
}

