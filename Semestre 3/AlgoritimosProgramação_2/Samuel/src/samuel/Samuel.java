package Samuel;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Samuel {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String arquivo = "";
        String stop = ".";
        String tdsPalavras[] = new String[] {};

        try (FileReader inputFile = new FileReader("arquivo.txt"); BufferedReader br = new BufferedReader(inputFile);) {
            while (!arquivo.equals(stop)) {

                arquivo = br.readLine();
                arquivo = arquivo.toLowerCase();
                String words[] = arquivo.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (!words[i].equals("") && !words[i].equals(".") && !recursiveLinearSearch(tdsPalavras, tdsPalavras.length - 1, words[i])) {

                        tdsPalavras = insertWordInArray(tdsPalavras, words[i], tdsPalavras.length + 1);
                        tdsPalavras = insertWord(tdsPalavras);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        printArray(tdsPalavras);
    }

    /**

     */
    public static String[] insertWordInArray(String[] currentArray, String newWord, int arraySize) {

        String[] newArray = new String[arraySize];

        for (int i = 0; i < newArray.length; i++) {
            if (i < currentArray.length) {
                newArray[i] = currentArray[i];
            } else {
                newArray[i] = newWord;
            }
        }

        return newArray;
    }

    /**
     * 
     */
    public static String[] insertWord(String[] currentArray) {

        String hasWord;
        int currentArraySize = currentArray.length - 1;

        for (int i = currentArraySize; i > 0; i--) {
            if (currentArray[i].compareTo(currentArray[i - 1]) < 0) {
                hasWord = currentArray[i - 1];
                currentArray[i - 1] = currentArray[i];
                currentArray[i] = hasWord;
            }
        }

        return currentArray;
    }


    /**
     * 
     */
    public static boolean recursiveLinearSearch(String wordsArray[], int position, String searchWord) {

        if (position >= 0) {
            if (position < 0 || searchWord.compareTo(wordsArray[position]) == 0)
                return true;
            else
                return recursiveLinearSearch(wordsArray, position - 1, searchWord);
        }

        return false;
    }

    /**
     * 
     */
    public static void printArray(String[] currentArray) {

        for (int i = 0; i < currentArray.length; i++) {
            System.out.println(currentArray[i]);
        }
        System.out.println("");
        System.out.println("total de palavras no dicionario = " + currentArray.length);
    }
}