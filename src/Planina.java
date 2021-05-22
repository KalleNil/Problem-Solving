
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
public class Planina {
    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
    
        int n = scan.nextInt();
    
        double i = Math.pow(2, n)+1;
    
        double sum = i*i;
        
        int answer = (int)sum;
        
        System.out.println(answer);
    }
    
    
    
}
