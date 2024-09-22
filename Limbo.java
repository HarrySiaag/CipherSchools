import java.util.*;
import java.io.*;
public class Limbo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int miss = 0;
        System.out.print("Enter bet amount : ");
        double bet = sc.nextDouble();
        double total = bet;
        System.out.print("On every loss increase by : ");
        double percent = sc.nextDouble();
        System.out.print("Stop on loss : ");
        double loss = sc.nextDouble();
        System.out.print("Set multiplier : ");
        double multiplier = sc.nextDouble();
        double profit = 0;
        for(double i = bet; total <= loss; miss++){
            profit = (i * multiplier) - total;
            System.out.printf("Bet amount - %.2f   Total - %.2f   Profit - %.2f\n",i,total,profit);
            i += (i * percent/100);
            total += i;
        }

        System.out.println("Total miss - " + miss);

    }
}
