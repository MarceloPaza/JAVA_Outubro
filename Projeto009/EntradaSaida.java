
/**
 * Descrição da classe EntradaSaida
 * Alfamidia - Programação Java (orient de obj) Tratamento de Exceção
 * @author (Marcelo Paza) 
 * @version (1.0)
 */ 

 import javax.swing.*;
public class EntradaSaida
{
    public static String receberString(String msg) { 
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        return txt;
    }
    
    public static int receberInt(String msg) { 
        String snro;
        int inro;
        snro = JOptionPane.showInputDialog(msg);
        try { 
            inro = Integer.parseInt(snro);
        } catch(Exception e) { 
            JOptionPane.showInputDialog(null, "Digite apenas numeros inteiros!");
            inro = 0;
        }
        return inro;
    }
    
    public static double receberDouble(String msg) { 
        String snro;
        double dnro;
        snro = JOptionPane.showInputDialog(msg);
        try { 
            dnro = Double.parseDouble(snro);
        } catch(Exception e) { 
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!");
            dnro = 0;
        }
        return dnro;
    }
    public static void mostrarTexto(String txt) { 
        JOptionPane.showMessageDialog(null, txt);
    }
}
