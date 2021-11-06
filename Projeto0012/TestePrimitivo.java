
/**
 * Essa é a classe TestePrimitivo
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class TestePrimitivo
{
    public static void main(String args[]) 
    { 
        //tipos primitivos
        //byte, short, int, long, float, double, char
        short n1 = 123;//short é numero menor 
        int n2 = n1;//e cabe dentro de um int
        
        //o int é maior do que um short
        int a1 = 3654987;
        //short é numero menor e não cabe dentro de um int
        short a2 = (short) a1;
        //float cabe dentro do double
        float f1 = 123.23f;
        //sendo menor o float cabe dentro do double
        double d1 = f1;
        
        System.out.println("valor resultado: "+a2);
    }
}
