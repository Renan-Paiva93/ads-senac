package exemplo;

/**
 * #02 aula 17-08-22
 */
//Pattern Singleton
public class Singleton {
    
    private static Singleton singleton;
    
    private Singleton(){} 
    
    public static Singleton getInstancia(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
