
/**
 * Escreva uma descrição da classe Calculadora aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Calculadora
{
    public static double executar(double n1, double n2, String op) throws MinhaEx { 
        double result = 0;
        
        if (n2 == 7)
            throw new MinhaEx();
            
        if (op.equals("+"))
            result = n1 + n2;
        if (op.equals("-"))
            result = n1 - n2;
        if (op.equals("*"))
            result = n1 * n2;
        if (op.equals("/"))
            result = n1 / n2;
        return result;
    }
}
