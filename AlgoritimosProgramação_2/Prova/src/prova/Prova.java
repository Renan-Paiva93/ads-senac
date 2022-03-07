/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

/**
 *
 * @author Dell
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String []args)
{
int i, j = 0;
int []vet1 = {7,2,5,8,4}; 
int []vet2 = {4,2,9,5}; 
int []vet3; 
String uniao = "";
boolean igual = true; 

      
     for(i = 0; i < vet1.length; i++)
     {
        uniao += ""+vet1[i]; 
     }


    
     while(j < vet2.length)
     {
        for(i = 0; i < vet1.length && igual; i++)
        {
           igual = (vet2[j] != vet1[i]);
        }
        if(igual) 
        {
           uniao += vet2[j];
        }
        j++;
        igual = true; 
     }

     vet3 = new int[uniao.length()];
        System.out.print("A união:");
        System.out.print("{ ");
     for(i = 0; i < vet3.length; i++)
     {
        vet3[i] = Integer.parseInt(""+uniao.charAt(i));
            System.out.print(vet3[i] + " "); 
     }
        System.out.print("}");

  }
   
    
}
