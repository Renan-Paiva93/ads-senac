/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

/**
 *
 * @author Dell
 */
public class Aula07_ProgSetGet {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        if (pessoa1.isAtivo())
            System.out.println(pessoa1.id + " "+ pessoa1.getNome() + " " + pessoa1.getMae() + " " + pessoa1.getPai());
        pessoa1.id=5;
        pessoa1.setNome("Lucas");
        pessoa1.setPai("João");
        pessoa1.setMae("Karoline");
        pessoa1.setAtivo(true);
            if(pessoa1.isAtivo())
                System.out.println(pessoa1.id + " " + pessoa1.getNome() + " " + pessoa1.getMae() + " " + pessoa1.getPai());
        
    }
    
}

class Pessoa {
    protected int id;
    private String nome;
    private String pai;
    private String mae;
    private boolean ativo;
    
    public String getNome() {
        return nome;
    }
    
    public String getPai() {
        return pai;
    }

    public String getMae() {
        return mae;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    public void setNome(String nom) {
        nome = nom;
    }
    
    public void setPai(String pai) {
        this.pai=pai;
    }
    
    public void setMae(String mamae) {
        mae=mamae;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}


