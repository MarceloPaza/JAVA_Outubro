
/**
 * Escreva uma descrição da classe TesteNumeros aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteNumeros
{
    public static void main(String args[]) { 
        //no java temos as classes que representam os tipos
        //para fazermos conversoes e etc...
        String snro = "1234";
        int inro = Integer.parseInt(snro);
        float fnro = Float.parseFloat(snro);
        double dnro = Double.parseDouble(snro);
        
        //da pra fazer o contrario tambem
        int ival = 9876;
        String sval = Integer.toString(ival);
        
        //e temos a classe "Math" para outras funcoes aritmeticas
        System.out.println( Math.pow(2,3) );
        System.out.println( Math.sqrt(25) );
        System.out.println( Math.sin(90) );
        System.out.println( Math.E );//constante
        System.out.println( Math.PI );//constante
    }
}
