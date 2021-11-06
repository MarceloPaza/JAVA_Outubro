     
/**
 * Classe "Principal", por onde comecara o sistema
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Principal
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String s[]) { 
        String res = "sim";
        int opt = 0;
        while (res.equalsIgnreCase("sim")) { 
            opt = EntradaSaida.receberInt("1: cad, 2: pesq, 3: limite");
            switch(opt) { 
            case 1:
                Sistema.cadastrarCliente();
                break;
            case 2:
                Sistema.pesquisar Cliente();
                break;
            case 3:
                Sistema.aumentarLimite();
                break;
            default:
                EntradaSaida.mostrarTexto("Inválida");
            }
            res = EntradaSaida.receberString("Continuar?");
        }
    }
}
