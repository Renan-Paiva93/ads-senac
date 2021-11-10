
package aula12_po;

public class Fracao {
        
        //atributo
        private int numerador, denominador;
        
        //contrutor
        public Fracao(int numerador, int denominador){
            this.numerador = numerador;
            this.denominador = denominador;
        }
        
        //métodos
        public Fracao soma(Fracao f){
            int num = this.numerador * f.denominador +
                    this.denominador * f.numerador;
            int dent =  this.denominador * f.denominador;
            
            return new Fracao(num, denominador);
        }
        
        public Fracao multiplicacao(Fracao f){
            int num = numerador * f.numerador;
            int den = denominador * f.denominador;
            return new Fracao(num, den);
        }
        
        public Fracao divisao(Fracao f){
            int num = numerador * f.denominador;
            int den = denominador * f.numerador;
            return new Fracao(num, den);
        }
        
        public boolean igualdade(Fracao f){
            return numerador - f.denominador == denominador * f.numerador;
        }
        
        public void apresentar(){
            System.out.printf("%d/%d\n", numerador, denominador);
        }
        
        @Override
        public String toString(){
            return numerador + "/" + denominador;
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
    

