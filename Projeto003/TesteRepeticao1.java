/**
 * descrição da classe TesteJanela 
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
import javax.swing.*;

class TesteRepeticao1
{
    //codigo para receber dois valores inteiros
    //e mostrar os numeros pares, a quantidade de pares e a soma deles
    public static void main(String args[]){ 
    String sini = JOptionPane.showInputDialog("Inicial");
    String sfim = JOptionPane.showInputDialog("Final");
    int ini = Integer.parseInt(sini);
    int fim = Integer.parseInt(sfim);
    
    int soma = 0;
    int qtde = 0;
    String result = "";
    for (int n=ini; n<=fim; n++) { 
        if (n % 2 == 0) {
        result = result + n + " - ";
        qtde = qtde + 1;
        soma = soma + n;
    }
}

JOptionPane.showMessageDialog(null, result);
JOptionPane.showMessageDialog(null, "Qtd: " + qtde);
JOptionPane.showMessageDialog(null, "Soma: " + soma);
}
}