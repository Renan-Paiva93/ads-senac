
package exercico;

/**
 *
 * @author Dell
 */
public enum Metodos {
    BUBBLE{
        @Override
        public Sort instance() {
            return new Bubble();
        }
        
    }, 
    INSERTION{
        @Override
        public Sort instance() {
            return new Insertion();
        }
        
    }, SELECTION{
        @Override
        public Sort instance() {
            return  new Selection();
    };
    
    public abstract Sort instance();
}
