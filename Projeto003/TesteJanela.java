/**
 * descrição da classe TesteJanela 
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
import javax.swing.*;

public class TesteJanela
{
    public static void main(String args[]) { 
        String sida;
        //Sempre virá um texto (String)
        sida = JOptionPane.showInputDialog("Digite sua idade");
        
        //mas eu posso usar uma classe para converter
        //nesse caso, converte uma String no formato de número
        //exemplo: "234" para 234
        int ida = Integer.parseInt(sida);
        
        String msg = "";
        if (ida >= 18) { 
            msg = "Ok. Tudo estabelecido";
        } else { 
            msg = "Não teve sorte... oeee";
        }
        
        //mostra uma mensagem na janela de diálogo
        JOptionPane.showMessageDialog(null, msg);
    }
}
