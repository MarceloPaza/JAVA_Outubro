/**
 * descrição da classe TesteJanela 
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */

import javax.swing.*;

public class TesteRepeticao2 
{
    //codigo que recebe dados de um grupo de pessoas (nome e idade)
    //e ao final mostra os dados da pessoa com menor idade
    public static void main(String args[]) { 
    //declaração das variáveis de uso dentro do "While"
    String nom;
    String sida;
    int ida;
    
    //inicialização das variáveis de controle
    String resp = "sim";
    String nomnew = "";
    int idanew = 200;
    int idatot = 0; //somador
    int nropes = 0; //contador
    
    while (resp.equalsIgnoreCase("sim")) { 
        nom = JOptionPane.showInputDialog ("Nome:");
        sida = JOptionPane.showInputDialog ("Idade:");
        ida = Integer.parseInt(sida); 
        
        if (ida < idanew) { 
            idanew = ida;// "idanew" é a idade do mais novo
            nomnew = nom;// "nomnew" é o nome do mais novo
        }
        idatot = idatot + ida; //somador das idades
        nropes = nropes + 1;//contador de pessoas
        
        resp = JOptionPane.showInputDialog("Tem mais alguém?");
    }
    double media = idatot / nropes;
    JOptionPane.showInputDialog(null, "Mais novo: "+nomnew);
    JOptionPane.showInputDialog(null, "Menor idade: "+idanew);
    JOptionPane.showInputDialog(null, "Média: "+media);
}
}

