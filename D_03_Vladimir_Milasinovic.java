package Domaci;

import java.util.Scanner;

public class DomaciTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti svoju radnu poziciju");
        String pozicija = sc.next();
        System.out.println("Unesi svoju platu");
        double plata = sc.nextDouble();
        if (pozicija.equalsIgnoreCase("fizikalac")) {
            System.out.println("Vasa plata je: " + plata * 1.15);


        } else if (pozicija.equalsIgnoreCase("masinovodja")) {
            System.out.println("Vasa plata je: " + plata * 1.3);


        } else if (pozicija.equalsIgnoreCase("inzenjer")) {
            System.out.println("Vasa plata je: " + plata * 1.2);
        } else {
            System.out.println("Uneta pogresna informacija");
        }
    }
}
