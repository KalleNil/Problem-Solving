
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
public class TheAmazingHumanCannonball {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        
        for (int i= 0; i<testCases; i++){
            Scanner scanloop = new Scanner(System.in);
            
            
            
            String[] currentTest = scanloop.nextLine().split(" ");
            
            try {
                
            } catch (Exception e) {
            }
            
            float initialVelocity =(float) Integer.parseInt(currentTest[0]);
            float angle = (float)Integer.parseInt(currentTest[1]);
            float distanceFromWall = (float)Integer.parseInt(currentTest[2]);
            float lowerEdge = (float)Integer.parseInt(currentTest[3]);
            float upperEdge =(float)Integer.parseInt(currentTest[4]);
            
            double radien = Math.toRadians(angle);
            double x = distanceFromWall/ (initialVelocity*Math.cos(radien));
            double y = (initialVelocity * x * Math.sin(radien)) - (4.905*x*x);
            
            if (lowerEdge +1 <= y && y <= upperEdge -1){
                System.out.println("safe");
            }else{
                System.out.println("not safe");
            }
            
            
                
        }
        
        
    }
  
    
}
