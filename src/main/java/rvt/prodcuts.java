package rvt;

import java.util.Scanner;

public  class prodcuts {

    public static void main(String args[])   {
        
        final int skruvesCena = 5;
        final int uzgrieznuCena = 3;
        final int paplaksnesCena = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skrūvju skaitu: ");

        int skruves = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi uzgriežņu skaitu: ");

        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi paplākšņu skaitu: ");

        int paplaksnes = Integer.valueOf(scanner.nextLine());

        boolean kluda = false;

        System.out.println("Skrūvju skaits: " + skruves);
        System.out.println("Uzgriežņu skaits: " + uzgriezni);
        System.out.println("Paplākšņu skaits: " + paplaksnes);

        int summa = skruvesCena*skruves + paplaksnesCena*paplaksnes + uzgrieznuCena*uzgriezni;
        if (uzgriezni <= skruves){
            System.out.println("Parbaudi pasūtījumu: par maz uzgriežņu");
            kluda = true;
        }
        if (paplaksnes <= skruves*2){
            System.out.println("Parbaudi pasūtījumu: par maz paplākšņu");
            kluda = true;
        }
        if (kluda == false){
            System.out.println("Pasūtījums kārtība");
        }
        System.out.println("Kopējā cena: " + summa);
    }
    
}
    

