/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

/**
 *
 * @author Dell
 */
public class Exmp_02_InsertSort {
    
    public static void main(String[] args) {
        
        String[] palavras ={"DRAGÃO","PIRATA","CANUDO","FEIJÃO","MEDIDA","CAVALO"};
        
        String sortedArray[] = InsertSortStrings(palavras, palavras.length);
        
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
    
    public static String[] InsertSortStrings(String array[], int f){
        String temp;
        for (int i = 0; i < f; i++) {
            for (int j=i+1;j<f;j++) {
                if(array[i].compareToIgnoreCase(array[j])>0){
               temp = array[i];
               array[i]=array[j];
               array[j]=temp;     
            }
          }
        }
    return array;
    
    }
}

