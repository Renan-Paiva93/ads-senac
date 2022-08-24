package estrategia;
/**
 * @author Dell
 */
public class UsaEstrategia {

    public static void main(String[] args) {
        Distancia distancia = new Distancia(100); // 100km
    }
    
    public static double calcularFrete(String empresa, Distancia distancia){
        if(empresa.equals("XPTO")){
            return distancia.getValor()*0.3;
        }else if (empresa.equals("CBA")){
            return distancia.getValor()*0.2;
        } else if (empresa.equals("ABC")){
            return distancia.getValor()*0.1;
        }else{
            return -1;
        }
    }
}