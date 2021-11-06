
/**
 * classe Principal de início do sistema
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Principal
{
    public static void main (String[] args) {
        //criação do objeto
        Monitor m1 = new Monitor();
        
        //uso dos métodos disponíveis
        m1.ligar();
        m1.exibirMsg("opa, olá pessoal");
        
        m1.ajustarReso(1600);
        m1.exibirMsg("Outra mensagem legal");
        
        m1.desligar();
    }
}
