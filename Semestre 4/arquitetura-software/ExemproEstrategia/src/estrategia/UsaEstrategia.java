package estrategia;
/**
 * @author Dell
 */
public class UsaEstrategia {

    public static void main(String[] args) {
        Distancia distancia = new Distancia(100); // 100km
        System.out.println(Empresa.values()[1].calcularFrete(distancia));
    }
    
}