
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       //IF
       //swich case
       Scanner entrada;
        entrada = new Scanner (System.in);
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
    } if (idade > 13) {    
        System.out.println("Criança");}
    } else if ((idade >= 18) &&(idade <= 26)){
    System.out.println("Jovem Adulto");
    else if ((idade >= 26) &&(idade <= 65)){
       
         System.out.println("Adulto");
    } else{
            System.out.println("idoso");
        }
    
    
