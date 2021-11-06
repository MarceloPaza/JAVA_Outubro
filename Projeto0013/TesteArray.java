/**
 * Escreva uma descrição da classe TesteArray aqui.
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */

import java.util.*;

public class TesteArray
{
    public static void main(String args[]) {
        //podemos declarar variaveis para compórtar
        //mais de um valor (array)
        String[] nomes = new String[5];
        nomes[0] = "Fulano";
        nomes[1] = "Beltrano";
        nomes[2] = "Teste";
        
        int[] idades = new int[5];
        idades[0] = 12;
        idades[1] = 23;
        idades[2] = 34;
        
        System.out.println(nomes[1].toUpperCase() + " com idade "+idades[1]);
        
        System.out.println(" ******* ");
        
        for (int i=0; i<nomes.length; i++) { 
            System.out.print(nomes[i] + " - ");
        }
        System.out.println("\n------- ");
        for (int i=0; i<idades.length; i++) { 
            System.out.print(idades[i] + " - ");
        }
        System.out.println("\n\n*******\n");
        //outra forma de listar o conteudo array
        for (String nom : nomes) { 
            System.out.print(nom + " - ");
        }
        System.out.println("\n------- ");
        for (int ida : idades) { 
            System.out.print(ida + " - ");
        }
        System.out.println("\n******* ");
    }
}
