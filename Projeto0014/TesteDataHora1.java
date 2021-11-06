
/**
 * Escreva uma descrição da classe TesteDataHora1 aqui.
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
import java.text.*;
import java.util.*;
public class TesteDataHora1
{
    public static void main(String s[]) { 
        //classe Date nao eh do pacote padrao java.lang
        //precisa ser importado do java.util
        Date hoje = new Date();
        System.out.println(hoje);
        
        //alem da classe base (Date), temos classes de formatacao
        //a DateFormat e a SimpleDateFormat sao do java.text
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(fmt.format(hoje));
        
        //fazer o inverso, ou seja, pegar um texto em formato data
        //e converter para um objeto do tipo Date (precisa try/catch)
        try { 
            String entrada = "25/09/1980";
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            Date aniver = fmt2.parse(entrada);
            System.out.println(fmt.format(aniver));
        
        } catch(Exception e) 
        { 
            System.out.println("Formato de data invalido");
        }
    }
}

