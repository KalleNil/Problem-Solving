

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class JewelsAndStones {
    
    public int numJewelsInStones(String jewels, String stones) {
        
        int sum = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<stones.length(); i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) +1);
            
        }
        for (int i= 0; i<jewels.length(); i++){
            sum = sum + map.getOrDefault(jewels.charAt(i), 0);
        } 
        
        return sum;
        
    }
   
    
     
    
}
