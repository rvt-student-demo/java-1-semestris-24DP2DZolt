package rvt;

import java.util.Scanner;

public class ciparu_summa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int skaits = 0;

        int summa = 0;
    
        while (true) {

            System.out.println("Ievadi skaitli: ");
        
            int skaitlis = Integer.valueOf(input.nextLine());

            if (skaitlis == 0){
                break;
            } else{
                skaits += 1;
                summa += skaitlis;
            }
        }

        System.out.println("Ievadīto skaitļu skaits: " + skaits);
        System.out.println("Ievadīto skaitļu summa: " + summa);
        
    
    }

}
