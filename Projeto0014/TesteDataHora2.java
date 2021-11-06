
/**
 * Escreva uma descrição da classe TesteDataHora2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.text.*;
import java.util.*;
public class TesteDataHora2
{
    public static void main(String s[]) { 
        //GregorianCalendar eh outra classe para manipulacao de tempo
        //Calendar eh a classe abstrata e GregorianCalendar eh a implementacao
        Calendar cal = new GregorianCalendar();
        
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.MONTH, 11);//mes comeca com 0 = janeiro
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        
        //misturando com o "formatador" simples
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(fmt.format(cal.getTime()));
        
        //adicionando valores ("andando" no calendario)
        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(fmt.format(cal.getTime()));
        
        //para subtrair valores, adiciona valor negativo
        cal.add(Calendar.MONTH, -1);
        System.out.println(fmt.format(cal.getTime()));
        
        //mudando somente o valor referenciado
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.MONTH, 11);//mes comeca com 0 = janeiro
        cal.set(Calendar.YEAR, 2020);
        
        cal.roll(Calendar.DAY_OF_MONTH, 5);
        System.out.println(fmt.format(cal.getTime()));                   
    }
}
