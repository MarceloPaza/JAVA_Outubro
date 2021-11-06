
/**
 * Escreva uma descrição da classe TesteStringBuilder aqui.
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class TesteStringBuilder
{
    public static void main(String s[]) { 
        //concatenando strings = Java cria objetos separados
        String txt1 = "Texto um";
        String txt2 = "Outro Texto";
        String res1 = txt1 + " - " + txt2;
        System.out.println(res1);
        
        System.out.println("\n------------\n");
        
        //usando StringBuilder
        StringBuilder sb = new StringBuilder("Um texto de teste");
        sb.append(" - ");
        sb.append("Outro texto de teste");
        String res2 = sb.toString();
        System.out.println(res2);        
    }
}
