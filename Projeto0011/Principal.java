import dados.*;

import javax.swing.*;

/**
 * Descrição da classe MinhaClasse 
 * Alfamidia - Programação Java (orient de obj)
 * @author (Marcelo Paza) 
 * @version (1.0)
 */

public class Principal
{
    public static void main(String[] s) 
    { 
        Cliente c1 = new Cliente();
        c1.setNome("Fulano de Tal");
        
        System.out.println("Nome: "+ c1.getNome());
    }

    
}
