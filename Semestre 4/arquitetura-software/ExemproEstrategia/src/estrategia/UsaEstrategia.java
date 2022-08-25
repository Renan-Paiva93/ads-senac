package estrategia;
/**
 * @author Dell
 */
public class UsaEstrategia {

    public static void main(String[] args) {
        Distancia distancia = new Distancia(100); // 100km
        System.out.println(determinarFrete(Empresa.XPTO, distancia));
    }
    
    public static double determinarFrete(Empresa empresa, Distancia distancia){
        Operacao op;
        if(empresa.equals(Empresa.ABC)){
            op=new ABC();
            return op.calcularFrete(distancia);
        }else if (empresa.equals(Empresa.CBA)){
            op=new CBA();
            return op.calcularFrete(distancia);
        } else if (empresa.equals(Empresa.XPTO)){
            op=new XPTO();
            return op.calcularFrete(distancia);
        }else{
            return -1;
        }
    }
}