
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class SodaSlurper {
    public static void main(String[] args) {
        
          Scanner scan = new Scanner(System.in);
          
          
          int emptyBottles = scan.nextInt() + scan.nextInt();
          int amountOfBottlesToBuy = scan.nextInt();
          
          int bottles = 0;
          int total = 0;
          
          while (emptyBottles>= amountOfBottlesToBuy){
            bottles = emptyBottles % amountOfBottlesToBuy;
            emptyBottles /= amountOfBottlesToBuy;
            total += emptyBottles;
            emptyBottles += bottles;
              
          }
          System.out.println(total);
    }
    
}
