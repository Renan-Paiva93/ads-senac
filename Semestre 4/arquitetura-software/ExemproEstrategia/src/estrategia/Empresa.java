package estrategia;
/**
 *
 * @author Dell
 */
public enum Empresa implements Operacao{
    XPTO{
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getValor()*0.3;
        }
     
    }, 
    CBA{
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getValor()*0.2;
        }
        
    }, 
    ABC{
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getValor()*0.1;
        }
        }
        
    };

