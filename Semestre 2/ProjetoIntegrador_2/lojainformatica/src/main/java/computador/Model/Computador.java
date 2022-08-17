/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Model;
//processdor
/**
 *
 * @author renan.paiva
 */
public class Computador {
    private static String marca = "RenanPaiva";
    
    private int CodPeca;
    private String processador;
    private String hd;

    public Computador() {
        
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computador.marca = marca;
    }

    public int getCodPeca() {
        return CodPeca;
    }

    public void setCodPeca(int CodPeca) {
        this.CodPeca = CodPeca;
    }


    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }
    
}