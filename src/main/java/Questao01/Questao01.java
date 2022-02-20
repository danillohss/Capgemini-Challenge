
package Questao01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    try{
        System.out.println("Insira o tamanho da escada de asteriscos:");        
        int size = input.nextInt();
        
        //Leitura dos asteriscos
        System.out.println(ladder(size).toString());
    }catch(InputMismatchException e){
    System.out.println("Falha");
    }
input.close();
}
public static String ladder(int size){
    StringBuilder stringBuilder = new StringBuilder();
    for (int i=0; i<size; i++) {
    	
    	//Laço dos espaços.
        for (int j=1; j<size-i; j++) {
            stringBuilder.append(" ");
            
        //Laço dos asteriscos.
        }for (int k = 0; k <=i; k++) {
            stringBuilder.append("*");
            
        }stringBuilder.append("\n");          
    }return stringBuilder.toString();       
}
}