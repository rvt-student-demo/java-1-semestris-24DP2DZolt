package rvt;

import java.util.Scanner;

public class javamooc2_3 {

    public static void main(String[] args) {
        astrology(4);
    }
    public static void Reapeating() {

        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitļus: ");
        int summa = 0;
        int skaits = 0;
        int para = 0;
        int nepara = 0;
        while (true) {
            int skaitlis = Integer.valueOf(input.nextLine());
            if (skaitlis == -1){
                break;
            }else{
                summa += skaitlis;
                skaits += 1;
                if (skaitlis % 2 == 0){
                    para += 1;
                }else{
                    nepara += 1;
                }
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Summa: " +  summa);         
        System.out.println("Sakitļu skaits: " + skaits);
        System.out.println("Vidējais aritmētiskais: "+ summa / skaits);
        System.out.println("Pāra skaitļu skaits: " + para);
        System.out.println("Nepāra skaitļu skaits: " + nepara);
        }
    public static void from_parameter_to_One(int skaitlis) {

        for (int i = skaitlis; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void divisible_by_Three(int sakums, int beigas) {

        for (int i = sakums; i >= beigas; i--){
            if (i % 3 == 0){
                System.out.println(i);
            }    
            
        }
    }

    public static void astrology(int augstums) {

        for (int i = 0; i < augstums; i++){
            for (int space = 0; space < i; space++){
                System.out.print(" ");
            }   
            for (int zvaigze = 0; zvaigze < i; zvaigze ++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}