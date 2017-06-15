

public class ThreadRunner {
    
    public static void main(String[] args) {
        //for(int i=0;i<3;i++){
        Racer racer = new Racer();
        //two thread objects are created
        //this can be extended to 9 threads as asked in enhancements
        Thread tortoise = new Thread(racer, "Tortoise");
        
        Thread hare = new Thread(racer, "Hare");
        
        //Starting the race
        
        System.out.println("Get Set.... Go!");    
        hare.start();
        tortoise.start();
        
       // }
        
    }
    
}
