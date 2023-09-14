package unit02.Homework.chickens;

import java.util.Scanner;

public class ChickenFarm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of chickens on farm: ");
        int numChick = scanner.nextInt();
        Chicken[] chickens = new Chicken[numChick];
        scanner.close();
        for(int i = 0;i < numChick; i++){
            chickens[i] = new Chicken();
            String string = chickens[i].toString() + ", laid An " + chickens[i].layEgg().toString();
            System.out.println(string.replaceAll("\n", ""));
        }
    }
}
