import javax.swing.*;
/**
 * Escreva uma descrição da classe TesteJanela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteJanela
{
    public static void main(String s[])
    { 
        //para criar uma janela, primeiro fazemos o "buraco"
        JFrame jan = new JFrame("Minha Janela");
        
        //depois, criamos uma "moldura" com "vidro"
        JPanel pan = new JPanel();
        
        //depois criamos os "adesivos"
        JTextField txt = new JTextField(20);
        JLabel lab = new JLabel("Nome");
        JButton btn = new JButton("Clique aqui");
        
        //Depois de criar todos elementos, é só "colar"
        pan.add(lab); pan.add(txt); pan.add(btn);
        jan.add(pan);
    
        //retoques finais (para ajustar o tamanho)
        jan.pack();
        
        //e por fim, "inauguracao"
        jan.setVisible(true);
    }
}