
 /**
 * classe Tela 
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */

import javax.swing.*;

 public class Tela
{
    /**
     * 
     */
    
    public static int retornaInt(String txt) { 
        //usa o método do java para abrir uma janela de diálogo
        //sempre retorna uma String
        String snum = JOptionPane.showInputDialog(txt);
        
        //converter a string em número
        int inum = Integer.parseInt(snum);
        
        //retornar para quem usar esse método
        return inum;
    }

    /**
     * 
     */

    public static void mostraTxt(String txt) { 
        //mostra na janela de diálogo o texto informado
        JOptionPane.showMessageDialog(null, txt);
    }
}