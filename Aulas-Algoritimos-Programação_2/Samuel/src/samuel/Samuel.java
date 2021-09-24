/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author renan.paiva
 */
public class Samuel {

public static void main(String[] args) throws FileNotFoundException, IOException {

        String text = "";
        String stop = ".";
        String allWords[] = new String[] {};

        try (FileReader inputFile = new FileReader("entrada.txt"); BufferedReader br = new BufferedReader(inputFile);) {
            while (!text.equals(stop)) {

                text = br.readLine();
                text = text.toLowerCase();
                String words[] = text.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (!words[i].equals("") && !words[i].equals(".")
                            && !recursiveLinearSearch(allWords, allWords.length - 1, words[i])) {

                        allWords = insertWordInArray(allWords, words[i], allWords.length + 1);
                        allWords = insertWord(allWords);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        printArray(allWords);
    }

    /**
     * Insert a word resizing the current array
     * 
     * @param currentArray
     * @param newWord
     * @param arraySize
     * @return
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
     * Insert word reordering elements
     * 
     * @param currentArray
     * @return
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
     * Find if a word exists in array (linear search)
     * 
     * @param wordsArray
     * @param position
     * @param searchWord
     * @return
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
     * Prints the current array content and word count
     * 
     * @param currentArray
     */
    public static void printArray(String[] currentArray) {

        for (int i = 0; i < currentArray.length; i++) {
            System.out.println(currentArray[i]);
        }

        System.out.println("total de palavras no dicionario = " + currentArray.length);
    }
}
