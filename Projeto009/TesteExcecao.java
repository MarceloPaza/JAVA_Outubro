
/**
 * Descrição da classe TesteExcecao
 * Alfamidia - Programação Java (orient de obj) Tratamento de Exceção
 * @author (Marcelo Paza) 
 * @version (1.0)
 */ 
public class TesteExcecao
{
    public static void main(String args[]) { 
        
        try { 
            System.out.println("valor do para metro que foi enviado: "+args[0]);
        } 
        catch(ArrayIndexOutOfBoundsException bug) { 
            System.out.println("Acesso a posicao do array que nao existe");
        }
        catch(Exception bug) { 
            System.out.println("Bug geral: "+ bug.getMessage());
        }
        finally { 
            System.out.println("Sempre entra nessa parte do codigo");
        }
    }
}
