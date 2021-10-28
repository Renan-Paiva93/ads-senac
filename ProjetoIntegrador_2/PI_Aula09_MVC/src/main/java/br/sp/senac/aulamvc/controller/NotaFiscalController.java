/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulamvc.controller;

import br.sp.senac.aulamvc.DAO.NotaFiscalDAO;
import br.sp.senac.aulamvc.model.NotaFiscal;

/**
 *
 * A controller vai receber os dados da View
 * 
 */
public class NotaFiscalController {
    
    // A CONTROLLER conversa com classe VIEW (utilizada as entradas)
    
    public static boolean salvar(int pNumeroNota, double pValorNota){
        
        NotaFiscal nota = new NotaFiscal();
        nota.setIdNota(pNumeroNota);
        nota.setValorNota(pValorNota);
        
        return NotaFiscalDAO.salvar(nota);
               
    }
    
}
