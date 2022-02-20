
package Questao03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao03 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    try{        
        System.out.println("Digite uma palavra:");
        String word = input.next();
        System.out.println(anagram(word).toString());        
    }catch(InputMismatchException e){
        System.out.println("Falha.");
    }input.close();    
}

public static String anagram(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>(); 
        //Guarda valor dos caracteres

        for (int i = 0; i <= string.length(); i++) {

            for (int j = i; j < string.length(); j++) {

                char[] character = string.substring(i, j + 1).toCharArray(); 
                Arrays.sort(character);
                
                //Array de armazenamento
                String subCaracter = new String(character);

                if (map.containsKey(subCaracter)) {                
                    map.put(subCaracter, map.get(subCaracter) + 1);
                }else{
                    map.put(subCaracter, 1);
                }
            }
            
        }int countPairs = 0; //Verificação dos anagramas
        for (String cont : map.keySet()) {

            int n = map.get(cont);
            countPairs += (n * (n - 1)) / 2;
        }
        stringBuilder.append("Saída:" + countPairs);
        return stringBuilder.toString();
    }   
}