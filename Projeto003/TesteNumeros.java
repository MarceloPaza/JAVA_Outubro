/**
 * Essa classe testa os numeros
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class TesteNumeros
{
    public static void main(String args[]) { 
        //no java temos as classes que representam os tipos
        //para fazermos conversóes e etc...
        String snro = "1234";
        int inro = Integer.parseInt(snro);
        float fnro = Float.parseFloat(snro);
        double dnro = Double.parseDouble(snro);
        
        //dá pra fazer o contrário também
        int ival = 9876;
        String sval = Integer.toString(ival);
        
        //e temos a classe "Math" para outras funções aritméticas
        System.out.println( Math.pow(2,3) );
        System.out.println( Math.sqrt(25) );
        System.out.println( Math.sin(90) );
        System.out.println( Math.E );//constante
        System.out.println( Math.PI);//constante
                
    }
}
