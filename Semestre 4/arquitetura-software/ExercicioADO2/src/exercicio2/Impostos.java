package exercicio2;

/**
 *
 * @author Dell
 */
public enum Impostos {
    IP1{
        @Override
        public Strategy instance() {
          return new Ip1();
        }
        
    },
    IP2{
        @Override
        public Strategy instance() {
             return new Ip2();
        }
        
    },
    IP3{
        @Override
        public Strategy instance() {
            return new Ip3();
        }
        
    };
    
    public abstract Strategy instance();
}
