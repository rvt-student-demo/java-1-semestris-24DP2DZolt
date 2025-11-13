package rvt;

import java.util.*;

public class Statistics {

    int count ;
    int sum ;
    int odd ;
    int even;

    public void statistics_Constructor(){
        this.count = 0;  
        this.sum = 0;   
        this.odd = 0;
        this.even = 0;  
    }

    public void addNumber(int number){
        count += 1;
        sum += number;
        if (number % 2 == 0){
            even += 1;
        
        }else{
            odd += 1;
        }
    }

    public int getCount(){
        return count;
    }

    public int summa(){
        return sum;
    }

    public double average(){
        return sum / count;
    }
    public int getEven(){
        return even;
    }
    public int getOdd(){
        return odd;
    }
}

public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        Statistics statistics = new Statistics();

        int ievade;

        while (true){
            System.out.println("Ievadi skaitli. Ievadi -1 lai pabeigtu");
            ievade = Integer.valueOf(input.nextLine());
            if (ievade == -1){
                break;
            }else{
                statistics.addNumber(ievade);
            }
            
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.summa());
        System.out.println("Average: " + statistics.average());

        
}   