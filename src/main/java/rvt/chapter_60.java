package rvt;

public class chapter_60 {
    public static void main(String[] args) {
        Exercise5();
        
    }
    public static void Exercise1(){
            int[] val = {0, 1, 2, 3};
            int sum = val[0] + val[1] + val[2] + val[3];
            System.out.println(sum);
        }
        public static void Exercise2(){
            int[] val = {13, -4, 82, 17};
            int[] twice = {0, 0, 0, 0};
            System.out.println("Oriģinālā kopa: "
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );  
            for (int i = 0; i < 4; i++){
                twice[i] = val[i]*2;
            } 
            System.out.println("Divkāršota kopa: "
            + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );           
        }
        public static void Exercise3() {
            int[] valA = { 13, -22,  82,  17};
            int[] valB = {-12, 24, -79, -13};
            int[] sum = {0, 0, 0, 0};

            for (int i = 0; i < 4; i++){
                sum[i] =  valA[i] + valB[i];
            }
            System.out.println("Kopu summa: "
            + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );    
        }
         public static void Exercise4() {
            int[] valA = { 13, -22,  82,  17};
            int[] valB = {0, 0, 0, 0};
            

            for (int i = 0; i < 4; i++){
                valB[i] =  25 - valA[i];
            }
            System.out.println("ValA: "
            + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] ); 

            System.out.println("ValA: "
            + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] ); 
            
            System.out.println("Summa: "
            + (valA[0] +  valB[0])+  " " + (valA[1] +  valB[1]) + 
            " " + (valA[2] +  valB[2]) + " " + (valA[3] +  valB[3]) ); 
        }
         public static void Exercise5() {
            int[] val = {0, 1, 2, 3};
            int temp;

            System.out.println("Oriģinālā kopa: "
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
            
            for (int i = 0; i < 2; i++)

            {temp = val[i];
            val[i] = val[3-i];
            val[3-i] = temp;
            
        }

            System.out.println("Atspoguļotā kopa: "
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

            }

        }
