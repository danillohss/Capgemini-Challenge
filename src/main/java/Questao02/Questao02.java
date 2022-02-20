package Questao02;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
        	System.out.println("Crie uma senha válida, a senha precisa conter:\n"
			  		+ "Digito, letra maiúscula e minuscula e caractere especial.\n"
			  		+ "--> Senha: ");
            //Entrada para a senha
            String password = input.next();
            System.out.println(verification(password).toString());
        }catch(InputMismatchException e){   
            System.err.println("Falha");
        }input.close(); 
    }    
    
public static String verification(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])"
                                        + "(?=.*\\d)(?=.*[-+_!@#$%^&.,?])"
                                        + "(?=.*{6,}).+$");
    
    Matcher matcher = pattern.matcher(string);
    //pattern e matcher que vão fazer todas as verificações nessesaria apontadas
    
    //Verificação booleana
    boolean matches = matcher.find(); 
    
    
    //Tratamento de senha correta e incorreta
    if(matches == true){ 
        stringBuilder.append("Senha cadastrada com sucesso.");
    }else{
        stringBuilder.append("Sua senha não atende todos os requisitos.");            
    }if(string.length() < 6){
        int lack = 6 - string.length();
        stringBuilder.append(" Faltam " +lack +" caracteres");
}return stringBuilder.toString();
}
}