
package conta;

/**
 *
 * @author Dell
 */
public class Conta {
    
    int numero;
    int numerodocliente;
    double saldo;
    String datadeabertura;
    int codigogerente;
    double limite;
    
    //Construtor
    Conta(double saldo, String datadeabertura, double limite){
        this.saldo = saldo;
        this.datadeabertura = datadeabertura;
        this.limite = limite;
    }
    
        //Métodos
    
    void saqueContaNormal(double saque){
        this.saldo = saldo - saque;
        this.saldo = saldo - (0.005 * saque);
    }
    
    void saqueContaEspecial(double saque){
        this.saldo = saldo - saque;
        this.saldo = saldo - (0.001 * saque);
    }
    
    void depositoConta(double saldo2){
        this.saldo = saldo + saldo2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumerodocliente() {
        return numerodocliente;
    }

    public void setNumerodocliente(int numerodocliente) {
        this.numerodocliente = numerodocliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDatadeabertura() {
        return datadeabertura;
    }

    public void setDatadeabertura(String datadeabertura) {
        this.datadeabertura = datadeabertura;
    }

    public int getCodigogerente() {
        return codigogerente;
    }

    public void setCodigogerente(int codigogerente) {
        this.codigogerente = codigogerente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
