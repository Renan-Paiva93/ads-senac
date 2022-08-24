package exemplo;

/**
 * #02 aula 17-08-22
 */
//Pattern Singleton
public class Singleton {
    
    private static Singleton singleton=new Singleton();;
    
    private Singleton(){} 
    
    public static Singleton getInstancia(){
        
        return singleton;
    }
}
