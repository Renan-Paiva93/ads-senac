package exemplo;

/**
 * @author Dell
 */
public class UsaSingleton extends Thread {

    @Override
    public void run() {
        Singleton sin1 = Singleton.getInstancia();
        System.out.println(sin1);
    }

    public static void main(String[] args) {
       UsaSingleton t1 = new UsaSingleton();
       UsaSingleton t2 = new UsaSingleton();
       UsaSingleton t3 = new UsaSingleton();
       UsaSingleton t4 = new UsaSingleton();
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
    
}
