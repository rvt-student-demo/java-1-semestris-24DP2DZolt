package rvt;

import java.util.*;


public class guessing_Game {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int skaitlis_dators = rand.nextInt(1,10);

        while (true){
            System.out.println("Uzmini skaitli: ");
            int skaitlis_lietotajs = Integer.valueOf(input.nextLine());

            if (skaitlis_lietotajs == skaitlis_dators){
                System.out.println("Uzminēji!!!");
                break;
            }
            System.out.println("Neuzminēji!!!!!");
        }
    }
}
