package rvt;

import java.util.*;

public class javamooc3_2 {
    public static void main(String[] args) {
       valuesList();
    }

    public static void onlytheseNumbers(){
    
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> ievadi = new ArrayList(); 

        int sakums; 
        int beigas;

        while  (true){
            int skaitlis = Integer.valueOf(input.nextLine());
            
            if (skaitlis == -1 ){
                break;
            }else{
                ievadi.add(skaitlis);

            }
        }
           System.out.print("No kurienes? ");
           sakums = Integer.valueOf(input.nextLine());
           System.out.println(" Līdz kurienei? "); 
           beigas = Integer.valueOf(input.nextLine());

           for (int i = sakums; i < beigas; i++){
                System.out.println(ievadi.get(i));
           }
        
    }

    public static void listSize(){

        ArrayList<String> ievadi = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String ievads;

        

        while (true){
            ievads = input.nextLine();
            if (ievads.equals("")) {
                 break;
            } else{
               ievadi.add(ievads); 
            }
            
        }
       
        System.out.println(ievadi.size());
    }

    public static void onTheList(){
        ArrayList<String> vardi = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String ievads;

        String target = null;

        Boolean atrasts = false;

        while (true){
            ievads = input.nextLine();
            if (ievads.equals("")){
                break;
            }else{
                vardi.add(ievads);
            }
        
        }

        System.out.print("Vārdu kuru atrast? ");
        target = input.nextLine();

        for (String i : vardi){
            if (i.equals(target)){
                System.out.println(i + " tika atrasts!");
                atrasts = true;
                break;
        }
    }
        if (atrasts == false){
            System.out.println(target + " netika atrasts!");
        }
    }
    public static void valuesList(){
        ArrayList<String> vardi = new ArrayList<>();

        vardi.add("First");
        vardi.add("Second");
        vardi.add("Third");
        System.out.println(vardi);
        
        removeLast(vardi);
        removeLast(vardi);
        System.out.println(vardi);
    }
    public static void removeLast(ArrayList<String> string){
        for (int i = 0; i < string.size(); i++){
            if (i == string.size()-1){
                string.remove(i);
            }
        }
    }
}
