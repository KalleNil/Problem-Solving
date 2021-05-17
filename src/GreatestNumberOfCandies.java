
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class GreatestNumberOfCandies {
    
    int tempMaxValue;
    
    public List<Boolean> kidsWithCandies(int[] candies, int extrCandies){
        for (int i : candies){
            if (i > this.tempMaxValue){
                this.tempMaxValue = i;
            }
        }
        
        List<Boolean> kidHasEnoughCandy = new ArrayList<Boolean>();
        
        for (int i = 0; i<candies.length; i++)
            if (candies[i]+extrCandies >=this.tempMaxValue){
                kidHasEnoughCandy.add(true);
                
            }else{
                kidHasEnoughCandy.add(true);
                
            }
        return kidHasEnoughCandy;
        
        
        
    }
   
    
     
    
}
