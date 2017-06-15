
import java.util.Random;




public class Racer implements Runnable {
    
    public static String h;
    
    public void race() {
        
        //Random numbber generated to tell the Hare when to sleep
        

        Random rand = new Random();

        //Here a random integer is generated form 1 to 1111
        //This is to satisfy the specification of 90% sleep periof of Hare
        //from 1-1111 there is a 90% probability that a random nubmer is generated from 1-1000
        //Hence Satisfying the requirement
        final int HARES_Lazy = rand.nextInt(1111) + 1;
        
        for (int distance = 0; distance <= 1000; distance+=10) {
            
            System.out.println(Thread.currentThread().getName() + " : " + distance + " meters.");
            
            //Checking if care needs to sleep
            if (distance == HARES_Lazy && Thread.currentThread().getName().equals("Hare")) {
                
               //The Hare decides to take a nap midway through since he is so far ahead
                try {
                    System.out.println(Thread.currentThread().getName() + " is sleeeeeping ZZZZZZZZZ");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            
            //Check if race is finished
            boolean isRaceWon = this.isRaceWon(distance);
            
            
            if (isRaceWon) 
                break;
            
        }
        
    }
    
    private boolean isRaceWon(int totalDistance) {
        
        boolean isRaceWon = false;
        
        if ((Racer.h == null) && (totalDistance == 1000)) {
            
            String winnerName = Thread.currentThread().getName();
            
            Racer.h = winnerName;
            System.out.println(Racer.h+": I finished");
            System.out.println("The race is over.! Winner is: " + Racer.h);
            
            
            isRaceWon = true;
            
        } else if (Racer.h == null) {
            
            isRaceWon = false;
            
        } else if (Racer.h != null) {
            
            isRaceWon = true;
            
        }
        //one small limitation of my project is that the loop executes one last time
        //after the race is over.This can be overcomed in future design.
        return isRaceWon;
        
    }
    
    @Override
    public void run() {
        
        this.race();
        
    }
    
}
