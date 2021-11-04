/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_po;

/**
 *
 * @author Dell
 */
public class Fracao {
        
        //atributo
        private int numerador, denominador;
        
        //contrutor
        public Fracao(int numerador, int denominador){
            this.numerador = numerador;
            this.denominador = denominador;
        }
        
        // getters e setters
        //usado para recupepar um dado num determinado atributo
        public int getNumerador(){
            return numerador;
        }
        
        
        //modificar o dado
        public void setNumerador(int numerador){
            this.numerador = numerador;
        }
        
        public int getDenominador(){
            return denominador;
        }
        
        public void setDenominador(int denominador){
            this.denominador = denominador;
            
        }
        
    }
    

