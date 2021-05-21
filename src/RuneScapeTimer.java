
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Stopwatch {
    
    int secounds = 0;
    Timer timer = new Timer();
    TimerTask task  = new TimerTask() {
        @Override
        public void run() {
            secounds++;
            System.out.println(secounds);
            
            if (secounds== 900){
                secounds = 0;
            }
        }
    };
    public  void start(){
        timer.scheduleAtFixedRate(task,1000,1000);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stopwatch timer = new Stopwatch();
        timer.start();
        
    }
    
}