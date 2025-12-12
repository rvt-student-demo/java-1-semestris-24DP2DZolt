package rvt;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class chapter44 {
    public static void main(String[] args) {
        ex4();
    }

    public static void ex1(){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your name: ");

        String name = input.nextLine();

        int space = name.indexOf(" ");

        String surname = name.substring(space);

        surname = surname.toUpperCase();

        name = name.substring(0, space);

        String ans = "";

        ans = ans.concat(name).concat(surname);

        System.out.println(ans);
    }

    public static void ex2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = input.nextLine();

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }

    public static void ex3(){
        Scanner input = new Scanner(System.in);


        ArrayList <String> maleNames = new ArrayList<>();

        maleNames.add("Elroy");
        maleNames.add("Fred");
        maleNames.add("Graham");

        ArrayList <String> femaleNames = new ArrayList<>();
        femaleNames.add("Amy");
        femaleNames.add("Buffy");
        femaleNames.add("Cathy");

        String name = input.nextLine();
        int space = name.indexOf(" ");

        String firstName = name.substring(0, space);

        String title = "";

        if (maleNames.contains(firstName)){
            title = title.concat("Mr. ").concat(name);
            System.out.println(title);
        }else if(femaleNames.contains(firstName)){
            System.out.println(title);
            title = title.concat("Ms. ").concat(name);

        }else{
            System.out.println("Error");
        }
    }
        
        public static void ex4(){
            Scanner input = new Scanner(System.in);

            int time = Integer.valueOf(input.nextLine());

            LocalTime localtime = LocalTime.of(time / 100, time % 100);
            String formatedTime = localtime.format(DateTimeFormatter.ofPattern("mm:ss"));

            System.out.println("Cook time: "+formatedTime);
        }

        public static void ex5(){
            Scanner input = new Scanner(System.in);

            String message = input.nextLine();

            int var1 = message.indexOf("//");
            int var2 = message.indexOf("/*");
            int var3 = message.indexOf("*/");


            
            while(input.hasNextLine()){
                
            }

            

            
        }
    }