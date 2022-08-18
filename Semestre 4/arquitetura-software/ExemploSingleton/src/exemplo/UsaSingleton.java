package exemplo;

/**
 * @author Dell
 */
public class UsaSingleton extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton sin1 = Singleton.getInstancia();
        Singleton sin2 = Singleton.getInstancia();
        System.out.println(sin1);
        System.out.println(sin2);
    }
    
}
