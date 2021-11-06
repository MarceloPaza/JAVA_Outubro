
/**
 * Descrição da classe Principal 
 * Alfamidia - Programação Java (orient de obj)
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Principal
{
    public static void main(String s[]) 
    { 
        //cria objeto
        Cliente fulano = new Cliente();
        
        //usando o metodo para obter o nome
        System.out.println("Nome do cliente 1: "+ fulano.getNome());
        System.out.println("Email do cliente 1: "+ fulano.getEmail());
        System.out.println("Telefone do cliente 1: "+ fulano.getTelefone());
        
        //usando o metodo para ajustar algum valor
        fulano.setEmail("fulano@tao.com.br");
        
        System.out.println("Nome do cliente : "+ fulano.getNome());
        System.out.println("Novo Email do cliente 1: "+ fulano.getEmail());
        System.out.println("Telefone do cliente 1: "+ fulano.getTelefone());
        
    }
}
