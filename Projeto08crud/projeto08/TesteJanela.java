
/**
 * Escreva uma descrição da classe TesteJanela aqui.
 * 
 * @author (MarceloPaza) 
 * @version (1.0)
 */
import javax.swing.*;

public class TesteJanela
{
    public static void main(String s[])
    {
        // para criar uma janela, primeiro fazemos o "buraco"
        JFrame jan = new JFrame("Minha Janela");
        
        //depois criamos uma "moldura" com "vidro"
        JPanel pan = new JPanel();
        
        //e então criamos os "adesivos"
        JTextField txt = new JTextField(20);
        JLabel lab = new JLabel("Nome");
        JButton btn = new JButton("Clique aqui");
        
        //depois de criar todos os elementos, é só "colar"
        pan.add(lab); pan.add(txt); pan.add(btn);
        jan.add(pan);
        
        //retoques finais (para ajustar o tamanho)
        jan.pack();
        
        //e por fim a "inauguração"
        jan.setVisible(true);
        
    }
}
    