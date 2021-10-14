/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.MODEL;

/**
 *
 * @author renan.paiva
 */
public class Computador {
    private static String marca = "RenanPaiva";
    private String processador;
    private String hd;

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computador.marca = marca;
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