
package conta;

/**
 *
 * @author Dell
 */
public class TesteConta {
    public static void main(String[] args) {
        
        Conta contax;
        contax = new Conta(0.00, "13/05/2012", 4000.00);
        
        contax.numerodocliente=1347;
        contax.codigogerente=771;
        contax.depositoConta(2000);
        //contax.saqueConta(500);
        System.out.println(" o saldo atual é: " + contax.saldo);
    }
    
}
