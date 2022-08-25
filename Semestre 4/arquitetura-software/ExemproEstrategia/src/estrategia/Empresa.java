package estrategia;

/**
 *
 * @author Dell
 */
public enum Empresa implements Operacao{
    XPTO{
        @Override
        public double calcularFrete(Distancia distancia) {
            
        }
     
    }, 
    CBA{
        @Override
        public double calcularFrete(Distancia distancia) {
        }
        
    }, 
    ABC{
        @Override
        public double calcularFrete(Distancia distancia) {
        }
        
    };
}
